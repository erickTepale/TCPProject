package com.gottit.TCPProject.Model.CompositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChannelMessagePK {
    @Column(name = "channel_id")
    private Long channel_id;

    @Column(name = "message_id")
    private Long message_id;

    public ChannelMessagePK(Long channel_id, Long message_id) {
        this.channel_id = channel_id;
        this.message_id = message_id;
    }
    public ChannelMessagePK(){}

    public Long getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Long channel_id) {
        this.channel_id = channel_id;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }
}
