package cell;

import sheet.Sheet;

public class Concatenate extends Cell implements TextFormula {

    private int startX;
    private int endX;

    private int startY;
    private int endY;

    public Concatenate(int startX, int endX, int startY, int endY) {
        this.startX = startX;
        this.endX = endX;

        this.startY = startY;
        this.endY = endY;
    }

    @Override
    public String calculate() {
        Sheet sheet = getSheet();
        String result = "";
        for (int y = startY; y < endY; y++) {
            for (int x = startX; x < endX; x++) {
                result += sheet.getElement(x, y).toString();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(this.calculate());
    }
}