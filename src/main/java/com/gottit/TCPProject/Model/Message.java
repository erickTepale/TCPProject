package com.gottit.TCPProject.Model;

public class Message {
    private Integer message_id;
    private Integer user_id;
    private String message;
    private String time; //datetime data structure

    public Message(Integer message_id, Integer user_id, String message) {
        this.message_id = message_id;
        this.user_id = user_id;
        this.message = message;
    }

    //shouldnt use this as db inputs datetime automaticaly on insert.
    public Message(Integer message_id, Integer user_id, String message, String time) {
        this.message_id = message_id;
        this.user_id = user_id;
        this.message = message;
        this.time = time; //set this to null ?
    }

    public Message(){
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", user_id=" + user_id +
                ", message='" + message + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
