package com.gottit.TCPProject.Repository;

import com.gottit.TCPProject.Model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    //public Message findByMessage_id(Long message_id);
    List<Message> findAllByMessage_user_id(Long user_id);
}