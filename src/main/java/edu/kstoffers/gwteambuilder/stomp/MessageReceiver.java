package edu.kstoffers.gwteambuilder.stomp;

public class MessageReceiver {

    private String message;

    public MessageReceiver() {

    }

    public MessageReceiver(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
