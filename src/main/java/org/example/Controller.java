package org.example;

public class Controller {
    private FieldState symbol;
    private int scoreX = 0;
    private int scoreO = 0;
    private int i = 1;
    private final Model model;
    private final View view;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public FieldState handleGameStep(int fieldCoordY, int fieldCoordX){
        game(fieldCoordY, fieldCoordX);
        return symbol;
    }

    public void checkWinner() {
        boolean isSomeoneWin = false;
        boolean isWinnerX = false;
        String winnerStr = "";

        if (model.checkWinner(FieldState.CROSS)) {
            winnerStr = "Победа X";
            isSomeoneWin = true;
            isWinnerX = true;
        }

        if (model.checkWinner(FieldState.TOE)) {
            winnerStr = "Победа O";
            isSomeoneWin = true;
            isWinnerX = false;
        }

        if(isSomeoneWin){
            changeScore(isWinnerX);
            view.showWinner(winnerStr);
            view.showScores(String.valueOf(scoreX), String.valueOf(scoreO));
            i = 1;
        }
    }

    public void resetGameBoard() {
        model.resetTable();
        view.setUpGameBoardForNewGame();
    }

    private void changeScore(boolean isWinnerX) {
        if (isWinnerX) {
            scoreX++;
        } else {
            scoreO++;
        }
        String playerX = String.valueOf(scoreX);
        String playerO = String.valueOf(scoreO);
        view.showScores(playerX, playerO);
    }

    private void game(int fieldCoordY, int fieldCoordX) {
        String currentPlayer;
        if (i % 2 == 0) {
            symbol = FieldState.CROSS;
            currentPlayer = FieldState.TOE.toString();
        } else {
            symbol = FieldState.TOE;
            currentPlayer = FieldState.CROSS.toString();
        }
        model.setValue(fieldCoordY, fieldCoordX, symbol);
        view.showCurrentPlayer(currentPlayer);
        i++;
    }
}
