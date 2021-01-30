package rule.basicIntegrationRule;

import function.functionInterface.Function;

public abstract class Rule
{
    protected int stepsNumber;
    protected double begin, end, deltaX;
    protected Function function;

    public Rule(int stepsNumber, double begin, double end, Function function) {
        this.stepsNumber = stepsNumber;
        this.begin = begin;
        this.end = end;
        this.function = function;
        deltaX = (end - begin) / stepsNumber;
    }

    public abstract double getIntegral();
    public abstract String getName();
}
