package com.gottit.TCPProject.Repository;

import com.gottit.TCPProject.Model.CompositeKey.DirectMessagePK;
import com.gottit.TCPProject.Model.DirectMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DirectMessageRepository extends CrudRepository<DirectMessage, DirectMessagePK> {
    List<DirectMessage> findAllByDirectMessagePK_ToId(Long to_id);


}
