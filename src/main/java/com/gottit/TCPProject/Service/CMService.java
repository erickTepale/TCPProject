package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.ChannelMessage;
import com.gottit.TCPProject.Model.CompositeKey.ChannelMessagePK;
import com.gottit.TCPProject.Model.Message;
import com.gottit.TCPProject.Repository.ChannelMessageRepository;
import com.gottit.TCPProject.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CMService {
    @Autowired
    private ChannelMessageRepository CMrepository;

    @Autowired
    private MessageRepository MessageRepository;

    public Iterable<ChannelMessage> findAll(Long channel_id){
        //maybe for each return the messages that belong in the channel?
        return CMrepository.findAllByChannelMessagePK_ChannelID(channel_id);
    }

    //can get channel
    public Message create(Message message, Long channel_id){
        //format time
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //store the message in table
        message.setTime(sdf.format(new Date()));
        Message temp = MessageRepository.save(message);

        //create primary composite key for ChannelMessage
        ChannelMessagePK pk = new ChannelMessagePK(channel_id, temp.getMessage_id());

        //store row into ChannelMessage table in database
        CMrepository.save(new ChannelMessage(pk));

        //return the newly created message
        return temp;
    }

    //get all messages in the channel
    public Iterable<Message> show(Long channel_id){
        List<Message> physicalMessages = new ArrayList<>();

        List<Long> fromMessageId =
                CMrepository.findAllByChannelMessagePK_ChannelID(channel_id)
                        .stream()
                        .map(ChannelMessage::getChannelMessagePK)
                        .map(ChannelMessagePK::getMessage_id)
                        .collect(Collectors.toList());

        return MessageRepository.findAllById(fromMessageId);
    }

}
