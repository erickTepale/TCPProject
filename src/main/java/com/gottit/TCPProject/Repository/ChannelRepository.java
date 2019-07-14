package com.gottit.TCPProject.Repository;

import com.gottit.TCPProject.Model.Channel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends CrudRepository<Channel, Long > {



}
