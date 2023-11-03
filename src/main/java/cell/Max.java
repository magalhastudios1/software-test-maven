package cell;

import sheet.Sheet;

import java.lang.Math;

public class Max extends Cell implements NumberFormula {

    private int startX;
    private int endX;

    private int startY;
    private int endY;

    public Max(int startX, int endX, int startY, int endY){
        this.startX = startX;
        this.endX = endX;

        this.startY = startY;
        this.endY = endY;
    }

    @Override
    public float calculate(){
        Sheet sheet = getSheet();
        float max = Float.MAX_VALUE;
        for(int x = startX; x < endX; x++){
            for(int y = startY; y < endY; y++){
                Number number = (Number) sheet.getElement(x, y);
                max = Math.max(max, number.getValue());
            }
        }
        return max;
    }

    @Override
    public String toString(){
        return String.valueOf(this.calculate());
    }
}