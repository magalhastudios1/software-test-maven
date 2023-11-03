package cell;

import sheet.Sheet;

public abstract class Cell{
    private Sheet sheet;
    
    public abstract String toString();

    protected Sheet getSheet(){
        return this.sheet;
    }
}