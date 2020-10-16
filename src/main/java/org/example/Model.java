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

    public boolean checkWinner(FieldState symbol) {
        boolean fd1 = true, fd2 = true, f = false;
        for(int i = 0; i < tableWidth; i++) {
            fd1 &= getTableField(i,i).equals(symbol);
            fd2 &= getTableField(i,2-i).equals(symbol);
            boolean f1 = true, f2 = true;
            for(int j = 0; j < tableHeight; j++) {
                f1 &= getTableField(i,j).equals(symbol);
                f2 &= getTableField(j,i).equals(symbol);
            }
            f |= f1 || f2;
        }
        return fd1 || fd2 || f;
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
