package com.mabahmani.baleinstasavebot.model;

public class Chat {
    Long id;
    String type;
    String username;
    String first_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                '}';
    }
}
