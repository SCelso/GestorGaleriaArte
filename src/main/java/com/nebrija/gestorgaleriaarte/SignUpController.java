package com.nebrija.gestorgaleriaarte;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button btnRegistrarse;

    @FXML
    private Label lblErrors;

    @FXML
    private Label lblLogin;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private PasswordField txtPassword1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lblLogin.setOnMouseClicked(mouseEvent -> {
            try {
                App.setRoot("loginScreen");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

