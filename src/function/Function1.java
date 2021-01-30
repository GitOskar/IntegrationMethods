package function;

import function.functionInterface.Function;

public class Function1 implements Function {
    @Override
    public double getValueOf(double x) {
        return 1 + x*x;
    }

    @Override
    public String getName() {
        return "1 + x^2";
    }
}
