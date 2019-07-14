package com.gottit.TCPProject.Model;

public class UserChannel {
    private Long user_id;
    private Long channel_id;

    public UserChannel(Long user_id, Long channel_id) {
        this.user_id = user_id;
        this.channel_id = channel_id;
    }

    public UserChannel(){}

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Long channel_id) {
        this.channel_id = channel_id;
    }

    @Override
    public String toString() {
        return "UserChannel{" +
                "user_id=" + user_id +
                ", channel_id=" + channel_id +
                '}';
    }
}


