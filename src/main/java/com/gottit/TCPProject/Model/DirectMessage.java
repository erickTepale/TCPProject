package com.gottit.TCPProject.Model;

import com.gottit.TCPProject.Model.CompositeKey.DirectMessagePK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "direct_messages")
public class DirectMessage {

    @EmbeddedId
    private DirectMessagePK pks;

    public DirectMessage(DirectMessagePK pks) {
        this.pks = pks;
    }

    public DirectMessage(){}

    public DirectMessagePK getPks() {
        return pks;
    }

    public void setPks(DirectMessagePK pks) {
        this.pks = pks;
    }
}
