package com.mabahmani.baleinstasavebot.model;

public class From {
    Long id;
    String first_name;
    String username;
    Boolean is_bot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIs_bot() {
        return is_bot;
    }

    public void setIs_bot(Boolean is_bot) {
        this.is_bot = is_bot;
    }

    @Override
    public String toString() {
        return "From{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", username='" + username + '\'' +
                ", is_bot=" + is_bot +
                '}';
    }
}
