package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;

public class View {
    public Button playAgain;
    public Label labelWinner, scoreX, scoreO, who;
    public ArrayList<Button> fieldList;

    Controller controller = new Controller(this, new Model());

    public void initialize() {
        for(int i = 0; i < fieldList.size(); i++) {
            final int ind = i;
            fieldList.get(i).setOnAction(e -> onFieldClick(ind));
        }
    }

    void onFieldClick(int i) {
        String symbol = controller.handleGameStep(i/3, i%3).toString();
        fieldList.get(i).setText(symbol);
        fieldList.get(i).setDisable(true);
        controller.checkWinner();
    }

    @FXML
    public void onPlayAgainClick() {
        controller.resetGameBoard();
    }

    public void showWinner(String winner) {
        labelWinner.setText(winner);
        disableButtons();
    }

    public void showCurrentPlayer(String currentPlayer) {
        who.setText(currentPlayer);
    }

    public void showScores(String playerScoreX, String playerScoreO) {
        scoreX.setText(playerScoreX);
        scoreO.setText(playerScoreO);
    }

    public void setUpGameBoardForNewGame() {
        resetFields();
        enableButtons();
        labelWinner.setText(FieldState.EMPTY.toString());
    }

    private void resetFields() {
        for(Button f: fieldList) {
            f.setText(FieldState.EMPTY.toString());
        }
    }

    private void disableButtons() {
        for(Button f: fieldList) {
            f.setDisable(true);
        }
    }

    private void enableButtons() {
        for(Button f: fieldList) {
            f.setDisable(false);
        }
    }
}

