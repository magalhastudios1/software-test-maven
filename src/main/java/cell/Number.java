package cell;

public class Number extends Cell{

    private float value;

    public Number(float value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(this.value);
    }

    public float getValue(){
        return this.value;
    }
}