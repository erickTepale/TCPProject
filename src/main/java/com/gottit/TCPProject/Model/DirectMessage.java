package com.gottit.TCPProject.Model;

public class DirectMessage {
    private Long user_id; // Who the message is to
    private Long message_id; //who message is from

    public DirectMessage(Long user_id, Long message_id) {
        this.user_id = user_id;
        this.message_id = message_id;
    }

    public DirectMessage(){}

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
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
