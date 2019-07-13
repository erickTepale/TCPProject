package com.gottit.TCPProject.Model;

public class Channel {
    private Integer channel_id;
    private String channel_name;
    private Integer user_id; //creator of channel
    private Boolean isPublic;

    public Channel(Integer channel_id, String channel_name, Integer user_id, Boolean isPublic) {
        this.channel_id = channel_id;
        this.channel_name = channel_name;
        this.user_id = user_id;
        this.isPublic = isPublic;
    }

    public Channel(){}

    public Integer getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Integer channel_id) {
        this.channel_id = channel_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channel_id=" + channel_id +
                ", channel_name='" + channel_name + '\'' +
                ", user_id=" + user_id +
                ", isPublic=" + isPublic +
                '}';
    }
}
