package cell;

import sheet.Sheet;

public abstract class Cell{
    private String text;
    private Sheet sheet;
    
    public abstract float getValue();

    protected abstract Sheet getSheet();

    protected abstract Cell getSheetElement();
}