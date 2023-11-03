package hello;

public abstract class Cell{
    private String text;
    private Sheet sheet;
    
    public float getValue();

    protected Sheet getSheet();

    protected Cell getSheetElement();
}