module com.nebrija.gestorgaleriaarte {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nebrija.gestorgaleriaarte to javafx.fxml;
    exports com.nebrija.gestorgaleriaarte;
}