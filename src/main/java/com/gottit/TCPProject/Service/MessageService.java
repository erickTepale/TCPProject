package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.Message;
import com.gottit.TCPProject.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public Message show(Long id){
        return repository.findByMessage_id(id);
    }
}
