package com.gottit.TCPProject.Model;

public class DirectMessage {
    private Integer user_id; // Who the message is to
    private Integer message_id; //who message is from

    public DirectMessage(Integer user_id, Integer message_id) {
        this.user_id = user_id;
        this.message_id = message_id;
    }

    public DirectMessage(){}

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "user_id=" + user_id +
                ", message_id=" + message_id +
                '}';
    }
}
