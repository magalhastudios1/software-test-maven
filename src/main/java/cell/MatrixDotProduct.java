package cell;

import sheet.Sheet;

public class MatrixDotProduct extends Cell implements NumberFormula {
    private int startAX;
    private int startAY;

    private int width;
    private int height;

    private int startBX;
    private int startBY;

    public MatrixDotProduct(int startAX, int startAY, int width, int height, int startBX, int startBY) {
        this.startAX = startAX;
        this.startAY = startAY;

        this.width = width;
        this.height = height;

        this.startBX = startBX;
        this.startBY = startBY;
    }

    @Override
    public float calculate() {
        if (width == 0 || height == 0) {
            return 0;
        }
        Sheet sheet = getSheet();
        float result = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Number numberA = (Number) sheet.getElement(startAX + x, startAY + y);
                Number numberB = (Number) sheet.getElement(startBX + x, startBY + y);
                result += numberA.getValue() * numberB.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(this.calculate());
    }
}