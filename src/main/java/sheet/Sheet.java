package sheet;

import cell.Cell;

public final class Sheet{
    private static Sheet instance;

    private int width;
    private int height;

    private Cell [][] board;

    public Sheet(int width, int height){
        this.width = width;
        this.height = height;

        this.board = new Cell[width][height];
    }

    public static Sheet getInstance(int width, int height) {
        if (instance == null) {
            instance = new Sheet(width, height);
        }
        return instance;
    }

    public int getArea(){
        return this.width * this.height;
    }

    public void addElement(Cell cell, int x, int y){
        board[x][y] = cell;
    }

    public Cell getElement(int x, int y){
        return this.board[x][y];
    }
}