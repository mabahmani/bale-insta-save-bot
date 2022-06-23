package com.mabahmani.baleinstasavebot.model;

public class WebhookUpdate {
    private Long update_id;
    private Message message;

    public Long getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Long update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WebhookUpdate{" +
                "update_id=" + update_id +
                ", message=" + message +
                '}';
    }
}
