package rule;

import function.functionInterface.Function;
import rule.basicIntegrationRule.Rule;

public class RectangleRule extends Rule
{
    public RectangleRule(int stepsNumber, double begin, double end, Function function) {
        super(stepsNumber, begin, end, function);
    }

    @Override
    public double getIntegral() {
        double result = 0.0;
        double midpoint = begin + deltaX/2;

        for (int i=0 ; i<stepsNumber ; i++)
        {
            result += function.getValueOf(midpoint);
            midpoint += deltaX;
        }

        return result * deltaX;
    }

    @Override
    public String getName() {
        return "Rectangle Rule";
    }
}
