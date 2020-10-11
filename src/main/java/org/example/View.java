package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.List;

public class View {
    public Label labelWinner, scoreX, scoreO, who;
    Controller controller = new Controller(this, new Model());

    @FXML
    private List<Button> fieldList;

    @FXML
    void onFieldClick(ActionEvent event) {
        Button btn = (Button) event.getSource();
        int coordX = Integer.parseInt(btn.getProperties().get("coordX").toString());
        int coordY = Integer.parseInt(btn.getProperties().get("coordY").toString());
        FieldState symbol = controller.handleGameStep(coordY, coordX);
        btn.setText(String.valueOf(symbol));
        btn.setDisable(true);
        controller.checkWinner();
    }

    @FXML
    public void onPlayAgainClick() {
         controller.resetGameBoard();
    }

    public void showWinner(String winner){
        labelWinner.setText(winner);
        disableButtons();
    }

    public void showCurrentPlayer(FieldState currentPlayer) {
        who.setText(String.valueOf(currentPlayer));
    }

    public void showScores(String playerScoreX, String playerScoreO) {
        scoreX.setText(playerScoreX);
        scoreO.setText(playerScoreO);
    }

    public void setUpGameBoardForNewGame(){
        resetFields();
        enableButtons();
        labelWinner.setText(FieldState.EMPTY.toString());
    }

    private void resetFields() {
        for (Button button : fieldList) {
            button.setText(FieldState.EMPTY.toString());
        }
    }

    private void disableButtons() {
        for (Button button : fieldList) {
            button.setDisable(true);
        }
    }

    private void enableButtons() {
        for (Button button : fieldList) {
            button.setDisable(false);
        }
    }
}

