package org.example;

public class Model {
    private final int tableWidth = 3;
    private final int tableHeight = 3;
    private final FieldState[][] table = {
            {FieldState.EMPTY, FieldState.EMPTY, FieldState.EMPTY},
            {FieldState.EMPTY, FieldState.EMPTY, FieldState.EMPTY},
            {FieldState.EMPTY, FieldState.EMPTY, FieldState.EMPTY}
    };

    public FieldState getTableField(int i, int j) {
        return table[i][j];
    }

    public void setValue(int i, int j, FieldState value){
        table[i][j] = value;
    }

    public void resetTable(){
        for (int i = 0; i < tableHeight; i++) {
            for (int j = 0; j < tableWidth; j++) {
                table[i][j] = FieldState.EMPTY;
            }
        }
    }
}
