package com.gottit.TCPProject.Repository;

import com.gottit.TCPProject.Model.CompositeKey.DirectMessagePK;
import com.gottit.TCPProject.Model.DirectMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectMessageRepository extends CrudRepository<DirectMessage, DirectMessagePK> {
}
