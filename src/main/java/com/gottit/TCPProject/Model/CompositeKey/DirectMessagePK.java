package com.gottit.TCPProject.Model.CompositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DirectMessagePK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "to_id")
    private Long to_id;

    @Column(name = "message_id")
    private Long message_id;

    public DirectMessagePK(Long to_id, Long message_id) {
        this.to_id = to_id;
        this.message_id = message_id;
    }
    public DirectMessagePK(){}

    public Long getTo_id() {
        return to_id;
    }

    public void setTo_id(Long to_id) {
        this.to_id =to_id;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

}
