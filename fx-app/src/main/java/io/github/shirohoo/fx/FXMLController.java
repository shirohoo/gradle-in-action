package io.github.shirohoo.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField field;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello, " + field.getText() + "!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

}
