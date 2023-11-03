package cell;

import sheet.Sheet;

public class Sum extends Cell implements NumberFormula {

    private int startX;
    private int endX;

    private int startY;
    private int endY;

    public Sum(int startX, int endX, int startY, int endY){
        this.startX = startX;
        this.endX = endX;

        this.startY = startY;
        this.endY = endY;
    }

    @Override
    public float calculate(){
        Sheet sheet = getSheet();
        float sum = 0;
        for(int x = startX; x < endX; x++){
            for(int y = startY; y < endY; y++){
                Number number = (Number) sheet.getElement(x, y);
                sum += number.getValue();
            }
        }
        return sum;
    }

    @Override
    public String toString(){
        return String.valueOf(this.calculate());
    }
}