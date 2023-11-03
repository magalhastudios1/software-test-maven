package cell;

import sheet.Sheet;

public class Product extends Cell implements NumberFormula {

    private int startX;
    private int endX;

    private int startY;
    private int endY;

    public Product(int startX, int endX, int startY, int endY){
        this.startX = startX;
        this.endX = endX;

        this.startY = startY;
        this.endY = endY;
    }

    @Override
    public float calculate(){
        Sheet sheet = getSheet();
        float product = 0;
        for(int x = startX; x < endX; x++){
            for(int y = startY; y < endY; y++){
                Number number = (Number) sheet.getElement(x, y);
                product *= number.getValue();
            }
        }
        return product;
    }

    @Override
    public String toString(){
        return String.valueOf(this.calculate());
    }
}