package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<NguoiDung> users = new ArrayList<>();

    public boolean register(NguoiDung user, String plainPassword) {
        if (findByUsername(user.getUsername()) != null) {
            return false; // User already exists
        }

        user.setHashedPassword(pass.hashPassword(plainPassword));
        users.add(user);
        return true;
    }

    public NguoiDung login(String username, String plainPassword) {
        NguoiDung user = findByUsername(username);
        if (user == null) return null;

        if (pass.checkPassword(plainPassword, user.getHashedPassword())) {
            return user;
        }
        return null;
    }

    private NguoiDung findByUsername(String username) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
    public List<NguoiDung> getAllUsers() {
        // Trả về bản sao để tránh thay đổi trực tiếp danh sách gốc
        return new ArrayList<>(users);
    }
}
