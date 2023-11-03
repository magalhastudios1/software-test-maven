package cell;

import java.lang.Math;

public class Exponential extends Number{
    public Exponential(float base, float exponent){
        super((float) Math.pow(base, exponent));
    }
}
