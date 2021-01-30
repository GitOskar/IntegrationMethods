package function;

import function.functionInterface.Function;

public class Function2 implements Function {
    @Override
    public double getValueOf(double x) {
        return Math.pow(Math.E, x);
    }

    @Override
    public String getName() {
        return "e^x";
    }
}
