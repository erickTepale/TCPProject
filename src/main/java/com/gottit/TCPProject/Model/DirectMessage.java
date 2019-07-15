package com.gottit.TCPProject.Model;

import com.gottit.TCPProject.Model.CompositeKey.DirectMessagePK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "direct_message")
public class DirectMessage {

    @EmbeddedId
    private DirectMessagePK directMessagePK;

    public DirectMessage(DirectMessagePK directMessagePK) {
        this.directMessagePK = directMessagePK;
    }

    public DirectMessage(){}

    public DirectMessagePK getDirectMessagePK() {
        return directMessagePK;
    }

    public void setDirectMessagePK(DirectMessagePK directMessagePK) {
        this.directMessagePK = directMessagePK;
    }
}
