package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.Message;
import com.gottit.TCPProject.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public Optional<Message> show(Long id){
        //return repository.findByMessage_id(id);
        return repository.findById(id);
    }
}
