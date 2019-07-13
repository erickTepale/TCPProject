package com.gottit.TCPProject.Model;

public class UserChannel {
    private Integer user_id;
    private Integer channel_id;

    public UserChannel(Integer user_id, Integer channel_id) {
        this.user_id = user_id;
        this.channel_id = channel_id;
    }

    public UserChannel(){}

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Integer channel_id) {
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


