package edu.kstoffers.gwteambuilder.stomp;

public class MessageSender {

    private String username;

    public MessageSender() {

    }

    public MessageSender(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }
}
