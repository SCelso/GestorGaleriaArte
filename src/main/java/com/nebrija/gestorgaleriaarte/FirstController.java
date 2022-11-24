package com.nebrija.gestorgaleriaarte;

        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Button;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;

public class FirstController implements Initializable {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnVerGaleria;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)  {
        btnIniciarSesion.setOnAction(actionEvent -> {
            try {
                App.setRoot("loginScreen");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
