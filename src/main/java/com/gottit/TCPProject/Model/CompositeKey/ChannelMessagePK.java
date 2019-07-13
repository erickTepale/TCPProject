package com.gottit.TCPProject.Model.CompositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChannelMessagePK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "channel_id")
    private Long channelID;

    @Column(name = "message_id")
    private Long message_id;

    public ChannelMessagePK(Long channelID, Long message_id) {
        this.channelID = channelID;
        this.message_id = message_id;
    }
    public ChannelMessagePK(){}

    public Long getChannelID() {
        return channelID;
    }

    public void setChannelID(Long channelID) {
        this.channelID = channelID;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }


}
