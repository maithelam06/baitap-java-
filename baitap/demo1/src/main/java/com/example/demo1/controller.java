package com.example.demo1;



import javafx.fxml.FXML;
import javafx.scene.control.*;


import java.util.ArrayList;
import java.util.List;

public class controller {
    private AuthService authService = new AuthService();

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField fullNameField;
    @FXML
    private ListView<NguoiDung> userListView;

    public void handleRegister() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String email = emailField.getText();
        String fullName = fullNameField.getText();

        NguoiDung newUser = new NguoiDung(username, null, email, fullName);
        if (authService.register(newUser, password)) {
            showAlert("Success", "User registered successfully");
        } else {
            showAlert("Error", "Username already exists");
        }
    }

    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        NguoiDung user = authService.login(username, password);
        if (user != null) {
            showAlert("Success", "Login successful for " + user.getUsername());
        } else {
            showAlert("Error", "Invalid username or password");
        }
    }

    public void handleExportToXML() {
        try {
            XMLParser.exportUsersToXML(authService.getAllUsers(), "users.xml");
            showAlert("Success", "Users exported to users.xml");
        } catch (Exception e) {
            showAlert("Error", "Failed to export users: " + e.getMessage());
        }
    }


    public void handleImportFromXML() {
        try {
            List<NguoiDung> importedUsers = XMLParser.importUsersFromXML("users.xml");
            userListView.getItems().setAll(importedUsers);
            showAlert("Success", "Users imported from users.xml");
        } catch (Exception e) {
            showAlert("Error", "Failed to import users: " + e.getMessage());
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}