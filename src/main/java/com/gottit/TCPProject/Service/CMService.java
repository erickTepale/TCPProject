package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.ChannelMessage;
import com.gottit.TCPProject.Repository.ChannelMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CMService {
    @Autowired
    ChannelMessageRepository repository;

    public List<ChannelMessage> findAll(Long channel_id){
        //maybe for each return the messages that belong in the channel?
        return repository.findAllByChannelMessagePK_Channel_id(channel_id);
    }

}
