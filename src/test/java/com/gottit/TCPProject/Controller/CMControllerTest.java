package com.gottit.TCPProject.Controller;

import com.gottit.TCPProject.Model.ChannelMessage;
import com.gottit.TCPProject.Model.CompositeKey.ChannelMessagePK;
import com.gottit.TCPProject.Model.Message;
import com.gottit.TCPProject.Repository.ChannelMessageRepository;
import com.gottit.TCPProject.Repository.MessageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class CMControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    ChannelMessageRepository CMRepository;
    @MockBean
    MessageRepository MessageRepository;

    @Test
    public void testCreate() throws Exception{
//        List<Message> finallist = new ArrayList<>();
//        finallist.add(new Message(4L, 1L, "timeWorking?", "2019-07-14 15:12:45"));
//        finallist.add(new Message(8L, 1L, "testing againa?", "2019-07-14 15:03:43"));
        List<ChannelMessage> finalList =  new ArrayList<>();
        finalList.add(new ChannelMessage(new ChannelMessagePK(1L, 4L)));
        finalList.add(new ChannelMessage(new ChannelMessagePK(1L, 8L)));
        finalList.stream().forEach(System.out::println);
        Long givenId = 1L;
        BDDMockito
                .given(CMRepository.findAllByChannelMessagePK_ChannelID(1L))
                .willReturn(finalList);

        String expected = "ChannelMessage{channelMessagePK=ChannelMessagePK{channelID=1, message_id=4}}\n" +
                "ChannelMessage{channelMessagePK=ChannelMessagePK{channelID=1, message_id=8}}";

        String notExpected = "[]";

        this.mvc.perform(MockMvcRequestBuilders
                .get("/channel/" + givenId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(notExpected));


    }



}