package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    @FXML private Label labelica;
    public void HelloWorld(ActionEvent actionEvent) {
        labelica.setText("Hello World   ");
    }
}
    