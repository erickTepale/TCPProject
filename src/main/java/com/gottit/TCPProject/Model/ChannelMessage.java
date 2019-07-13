package com.gottit.TCPProject.Model;

public class ChannelMessage {
    private Integer channel_id;
    private Integer message_id;

    public ChannelMessage(Integer channel_id, Integer message_id) {
        this.channel_id = channel_id;
        this.message_id = message_id;
    }
    public ChannelMessage(){}

    public Integer getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Integer channel_id) {
        this.channel_id = channel_id;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    @Override
    public String toString() {
        return "ChannelMessage{" +
                "channel_id=" + channel_id +
                ", message_id=" + message_id +
                '}';
    }
}
