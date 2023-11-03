package cell;

import sheet.Sheet;

public abstract class Cell{
    private Sheet sheet = Sheet.getInstance(0, 0);
    
    public abstract String toString();

    protected Sheet getSheet(){
        return this.sheet;
    }
}