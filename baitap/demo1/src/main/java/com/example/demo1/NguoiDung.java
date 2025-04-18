package com.example.demo1;

public class NguoiDung {
    private String username;
    private String hashedPassword;
    private String email;
    private String fullName;

    // Constructors, getters and setters
    public NguoiDung() {}

    public NguoiDung(String username, String hashedPassword, String email, String fullName) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.email = email;
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
