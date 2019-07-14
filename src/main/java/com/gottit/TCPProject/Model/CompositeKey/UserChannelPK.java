package com.gottit.TCPProject.Model.CompositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable

public class UserChannelPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "channel_id")
    private Long channel_id;

    @Column(name = "user_Id")
    private Long userId;

    public UserChannelPK(Long channel_id, Long user_id) {
        this.channel_id = channel_id;
        this.userId = user_id;
    }
    public UserChannelPK() {
    }

    @Override
    public int hashCode(){
        return (int) channel_id.hashCode();
    }
    @Override
    public boolean equals(Object o){
        if (o ==this) return true;
        if (!(o instanceof UserChannelPK)) return false;
        UserChannelPK pk = (UserChannelPK) o;
        return pk.channel_id == channel_id && pk.userId == userId;
    }

    public Long getChannelID() {
        return channel_id;
    }

    public void setChannelID(Long channel_id) {
        this.channel_id = channel_id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
