package com.gottit.TCPProject.Model;
import com.gottit.TCPProject.Model.CompositeKey.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "channel_message")
public class ChannelMessage {
    @EmbeddedId
    private ChannelMessagePK channelMessagePK; // <- Must start Lowercase!!

    public ChannelMessage(){}

    public ChannelMessage(ChannelMessagePK channelMessagePK) {
        this.channelMessagePK = channelMessagePK;
    }

    public ChannelMessagePK getChannelMessagePK() {
        return channelMessagePK;
    }

    public void setChannelMessagePK(ChannelMessagePK channelMessagePK) {
        this.channelMessagePK = channelMessagePK;
    }

    @Override
    public String toString() {
        return "ChannelMessage{" +
                "channelMessagePK=" + channelMessagePK.toString() +
                '}';
    }
}
