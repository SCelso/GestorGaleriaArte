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

public class LoginController implements Initializable {

    @FXML
    private Button btnAcceder;

    @FXML
    private Button btnVolver;

    @FXML
    private Label lblErrors;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblSignUp;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblSignUp.setOnMouseClicked(actionEvent -> {
            try {
                App.setRoot("signUpScreen");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        btnVolver.setOnAction(actionEvent -> {
            try {
                App.setRoot("firstScreen");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
