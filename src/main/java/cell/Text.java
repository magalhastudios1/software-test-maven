package cell;

public class Text extends Cell {
    private String text;

    public Text(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return this.text;
    }
}
