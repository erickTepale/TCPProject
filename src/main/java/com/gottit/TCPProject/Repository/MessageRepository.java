package com.gottit.TCPProject.Repository;

import com.gottit.TCPProject.Model.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
    public Message findByMessage_id(Long message_id);
}
