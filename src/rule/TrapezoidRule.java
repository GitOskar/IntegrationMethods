package rule;

import function.functionInterface.Function;
import rule.basicIntegrationRule.Rule;

public class TrapezoidRule extends Rule
{
    public TrapezoidRule(int stepsNumber, double begin, double end, Function function) {
        super(stepsNumber, begin, end, function);
    }

    @Override
    public double getIntegral() {

        double result = function.getValueOf(begin) + function.getValueOf(end);
        double currentX = begin;
        for (int i=1 ; i<stepsNumber ; i++)
        {
            currentX += deltaX;
            result += 2 * function.getValueOf(currentX);
        }

        return result * deltaX / 2;
    }

    @Override
    public String getName() {
        return "Trapezoid Rule";
    }
}
