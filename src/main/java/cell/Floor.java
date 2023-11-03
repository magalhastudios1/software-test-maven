package cell;

import java.lang.Math;

public class Floor extends Number implements NumberFormula {
    public Floor(float value) {
        super(value);
    }

    @Override
    public float calculate() {
        return (float) Math.floor(this.getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(this.calculate());
    }
}
