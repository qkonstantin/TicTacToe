package org.example;

public enum FieldState {
    EMPTY(" "), CROSS("X"), TOE("O");

    private final String state;

    FieldState(String state){
        this.state = state;
    }

    @Override
    public String toString() {
        return state;
    }
}
