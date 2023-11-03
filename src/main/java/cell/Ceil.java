package cell;

import java.lang.Math;

public class Ceil extends Number implements NumberFormula {
    public Ceil(float value) {
        super(value);
    }

    @Override
    public float calculate() {
        return (float) Math.ceil(this.getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(this.calculate());
    }
}
