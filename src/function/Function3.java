package function;

import function.functionInterface.Function;

public class Function3 implements Function
{
    @Override
    public double getValueOf(double x) {
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) + 3;
    }

    @Override
    public String getName() {
        return "x^3 + 2x^2 + 3";
    }
}
