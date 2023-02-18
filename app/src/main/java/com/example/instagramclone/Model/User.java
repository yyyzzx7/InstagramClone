package com.example.instagramclone.Model;

/**
 * @author chrisyuhimself@gmail.com
 * @date 18/2/2023 15:45
 */
public class User {
    private String user_id;
    private String username;
    private String email;
    private long phone_number;

    public User(String user_id, String username, String email, long phone_number) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.phone_number = phone_number;
    }

    public User() {

    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
