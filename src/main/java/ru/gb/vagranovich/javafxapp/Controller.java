package ru.gb.vagranovich.javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextArea historyArea;

    @FXML
    private TextField userAnswer;

    private Chat chat;

    private int step;

    public Controller() {
        this.chat = new Chat();
    }

    public void clickCheckButton(ActionEvent actionEvent) {
        String answer = userAnswer.getText();
        if (answer.isBlank()) return;

        historyArea.appendText(answer + "\n");
        userAnswer.clear();
        userAnswer.requestFocus();

    }

    public void clickNewChat() {
        historyArea.clear();
        historyArea.appendText("---Начинаем новый чат-- \n");
        this.chat = new Chat();
    }

    public void clickExit(ActionEvent actionEvent) {
        System.exit(0);
    }
}