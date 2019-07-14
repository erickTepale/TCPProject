package com.gottit.TCPProject.Controller;

import com.gottit.TCPProject.Model.Message;
import com.gottit.TCPProject.Service.CMService;
import com.gottit.TCPProject.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CMController {

    @Autowired
    private CMService cmService;

    @PostMapping("/channel/{channel_id}/message")
    public ResponseEntity<Message> create(@RequestBody Message message, @PathVariable Long channel_id){
        System.out.println(message);
        return new ResponseEntity<>(cmService.create(message, channel_id), HttpStatus.CREATED);
    }

}
