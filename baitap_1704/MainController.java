package com.example.baitap_1704;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController {

    @FXML
    private TextField txtInput;
    @FXML private TextArea txtOutput;
    @FXML private RadioButton rbAES, rbRSA;
    private ToggleGroup toggleGroup;

    public void initialize() {
        toggleGroup = new ToggleGroup();
        rbAES.setToggleGroup(toggleGroup);
        rbRSA.setToggleGroup(toggleGroup);
        rbAES.setSelected(true);
    }

    @FXML
    public void handleProcess() {
        String input = txtInput.getText();
        if (input.isEmpty()) {
            txtOutput.setText("Vui lòng nhập dữ liệu.");
            return;
        }

        new Thread(() -> {
            try {
                Encryptable encryptor;
                String algorithm;

                if (rbAES.isSelected()) {
                    encryptor = new AESEncryption();
                    algorithm = "AES";
                } else {
                    encryptor = new RSAEncryption();
                    algorithm = "RSA";
                }

                String encrypted = encryptor.encrypt(input);
                String decrypted = encryptor.decrypt(encrypted);

//                // Lưu vào MySQL
//                DBHelper.saveToDatabase(encrypted, algorithm);

                Platform.runLater(() -> {
                    txtOutput.setText("Mã hóa: " + encrypted + "\nGiải mã: " + decrypted);
                });

            } catch (Exception e) {
                Platform.runLater(() -> txtOutput.setText("Lỗi: " + e.getMessage()));
            }
        }).start();
    }

    @FXML
    public void handleClear() {
        txtInput.clear();
        txtOutput.clear();
    }
}
