package com.gottit.TCPProject.Model;
import com.gottit.TCPProject.Model.CompositeKey.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "channel_message")
public class ChannelMessage {
    @EmbeddedId
    private ChannelMessagePK ChannelMessagePK;

    public ChannelMessage(){}

    public ChannelMessage(ChannelMessagePK channelMessagePK) {
        ChannelMessagePK = channelMessagePK;
    }

    public ChannelMessagePK getChannelMessagePK() {
        return ChannelMessagePK;
    }

    public void setChannelMessagePK(ChannelMessagePK channelMessagePK) {
        ChannelMessagePK = channelMessagePK;
    }
}
