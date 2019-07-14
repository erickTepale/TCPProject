package com.gottit.TCPProject.Model;

import com.gottit.TCPProject.Model.CompositeKey.UserChannelPK;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "user_channel")
//@IdClass(UserChannelPK.class)
public class UserChannel implements Serializable {
@EmbeddedId
private  UserChannelPK userChannelPK;
    private static final long serialVersionUID = 1L;


    public UserChannel() {

    }

//
//    @Column(name = "channel_id")
//
//    private Long channel_id;
//
//    @Column(name = "user_id")
//
//    private Long userid;

    public UserChannel(UserChannelPK userChannelPK) {
        this.userChannelPK = userChannelPK;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserChannel that = (UserChannel) o;
//        return channel_id.equals(that.channel_id) &&
//                userid.equals(that.userid);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(channel_id, userid);
//    }

//    public Long getChannel_id() {
//        return channel_id;
//    }
//
//    public void setChannel_id(Long channel_id) {
//        this.channel_id = channel_id;
//    }

//    public Long getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Long userid) {
//        this.userid = userid;
//    }


    public UserChannelPK getUserChannelPK() {
        return userChannelPK;
    }

    public void setUserChannelPK(UserChannelPK userChannelPK) {
        this.userChannelPK = userChannelPK;
    }
}
