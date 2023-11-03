package cell;

import java.lang.Math;

public class Factorial extends Number{
    public Factorial(float value){
        super(getFactorial(Math.round(value)));
    }

    static private int getFactorial(int value){
        int result = 1;
        for(int i = 1; i <= value;  i++){
            result *= i;
        }
        return result;
    }
}
