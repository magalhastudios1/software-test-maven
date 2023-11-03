package sheet;

import cell.Cell;

public final class Sheet{
    private int width;
    private int height;

    private Cell [][] board;

    public Sheet(int width, int height){
        this.width = width;
        this.height = height;

        this.board = new Cell[width][height];
    }

    public int getArea(){
        return this.width * this.height;
    }
}