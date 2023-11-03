package sheet;

import cell.Cell;

public final class Sheet {
    private static Sheet instance;

    private int width;
    private int height;

    private Cell[][] board;

    private Sheet(int width, int height) {
        this.width = width;
        this.height = height;

        this.board = new Cell[height][width];
    }

    public static Sheet getInstance(int width, int height) {
        if (instance == null) {
            instance = new Sheet(width, height);
        }
        return instance;
    }

    public static void reset(){
        instance = null;
    }
    
    public int getArea() {
        return this.width * this.height;
    }

    public void addElement(Cell cell, int x, int y) {
        board[x][y] = cell;
    }

    public Cell getElement(int x, int y) {
        return this.board[x][y];
    }

    public Cell getElement(String x, String y) {
        int xInt = xStringToInteger(x);
        int yInt = Integer.valueOf(y);
        return getElement(xInt, yInt);
    }

    public static int xStringToInteger(String x) {
        int LETTERS_IN_ALPHABET = 26;

        if (x != x.toUpperCase()) {
            return -1;
        }

        int position = 0;
        for (int i = 0; i < x.length(); i++) {
            position += (int) x.charAt(i) - 65;
            position += LETTERS_IN_ALPHABET * i;
        }

        return position;
    }

    public String printTable() {
        String result = "";
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Cell cell = getElement(x, y);
                if (cell == null) {
                    result += "null";
                } else {
                    result += getElement(x, y).toString();
                }
                if (x != width - 1) {
                    result += " | ";
                }
            }
            result += "\n";
        }
        return result;
    }
}