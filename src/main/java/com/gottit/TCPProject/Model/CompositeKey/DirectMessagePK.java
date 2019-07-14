package com.gottit.TCPProject.Model.CompositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DirectMessagePK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    private Long toId;

    @Column(name = "message_id")
    private Long message_id;

    public DirectMessagePK(Long toId, Long message_id) {
        this.toId = toId;
        this.message_id = message_id;
    }
    public DirectMessagePK(){}

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

}
