package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.Channel;
import com.gottit.TCPProject.Repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Component
public class ChannelService {

//    @Autowired
//    ChannelRepository

    public List<Channel> getChannelsByUserID(Iterable<Channel> allChannels, int userid){
      List channelsForUserid = new ArrayList();

      for(Channel ch : allChannels){
          if (ch.getUser_id()== userid) channelsForUserid.add(ch);

      }

      return channelsForUserid;
    }
}
