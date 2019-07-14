package com.gottit.TCPProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long message_id;
    private Long user_id;
    private String message;
    private String time; //datetime data structure

    public Message(Long message_id, Long user_id, String message) {
        this.message_id = message_id;
        this.user_id = user_id;
        this.message = message;
    }

    //shouldnt use this as db inputs datetime automaticaly on insert.
    public Message(Long message_id, Long user_id, String message, String time) {
        this.message_id = message_id;
        this.user_id = user_id; //who made message
        this.message = message;
        this.time = time; //set this to null ?
    }

    public Message(){
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
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
