package com.gottit.TCPProject.Controller;

import com.gottit.TCPProject.Repository.ChannelMessageRepository;
import com.gottit.TCPProject.Repository.MessageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class DMControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MessageRepository messageRepository;

    @MockBean
    private ChannelMessageRepository cmRepo;






}
