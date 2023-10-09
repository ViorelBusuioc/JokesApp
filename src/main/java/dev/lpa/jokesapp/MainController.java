package dev.lpa.jokesapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
    @FXML
    Label jokeField;
    @FXML
    Button button;
    @FXML
    RadioButton random, general, programming, dad, knock;

    @FXML
    public void onButtonClick(ActionEvent event) {

        if (random.isSelected()) {
            jokeField.setText(Main.generateJoke());
        } else if (general.isSelected()) {
            jokeField.setText(Main.generateGeneralJoke());
        } else if (programming.isSelected()) {
            jokeField.setText(Main.generateProgrammingJoke());
        } else if (dad.isSelected()) {
            jokeField.setText(Main.generateDadJoke());
        } else if (knock.isSelected()) {
            jokeField.setText(Main.generateKnockJoke());
        }

    }
}