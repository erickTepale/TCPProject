package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.CompositeKey.DirectMessagePK;
import com.gottit.TCPProject.Model.DirectMessage;
import com.gottit.TCPProject.Model.Message;
import com.gottit.TCPProject.Repository.DirectMessageRepository;
import com.gottit.TCPProject.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DMService {
    @Autowired
    DirectMessageRepository DMRepo;
    @Autowired
    MessageRepository messageRepo;
    @Autowired
    MessageRepository userRepo;

    //can get channel
    public Message create(Message message, Long to_id){
        //store the message in table
        Message temp = messageRepo.save(message);

        //create primary composite key for ChannelMessage
        DirectMessagePK pk = new DirectMessagePK(to_id, temp.getMessage_id());

        //store row into ChannelMessage table in database
        DMRepo.save(new DirectMessage(pk));

        //return the newly created message
        return temp;
    }



    // show DM from other user
    // in this case, the other person wrote the message, which they owns the message
    // and the current user called will be the user in the DirectUserPK
    public Iterable<Message> show(Long from_id, Long to_id) {

        // find all message_id user A created;
        List<Long> fromMessageId =
                messageRepo.findAllByMessage_user_id(from_id)
                        .stream()
                        .map(Message::getMessage_id)
                        .collect(Collectors.toList());

        // find all message_id user B received,
        // in these message_ids, find all message_ids that create by user A
        // those message_ids will be user A sent to user B
        List<Long> resultMessageId =
                DMRepo.findAllByDirectMessagePK_To_id(to_id)
                        .stream()
                        .map(DirectMessage::getDirectMessagePK)
                        .map(DirectMessagePK::getMessage_id)
                        .filter(fromMessageId::contains)
                        .collect(Collectors.toList());

        // get all those message from messageRepo using the filtered message_ids
        return messageRepo.findAllById(resultMessageId);
    }
}
