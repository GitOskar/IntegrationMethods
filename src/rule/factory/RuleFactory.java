package rule.factory;

import function.functionInterface.Function;
import rule.RectangleRule;
import rule.TrapezoidRule;
import rule.basicIntegrationRule.Rule;
import rule.ruleEnum.RuleEnum;

public class RuleFactory {

    public Rule createRule(int stepsNumber, double begin, double end, Function function, RuleEnum ruleEnum)
    {
        switch (ruleEnum)
        {
            case RECTANGLE_RULE: return new RectangleRule(stepsNumber, begin, end, function);
            case TRAPEZOID_RULE: return new TrapezoidRule(stepsNumber, begin, end, function);
            default: throw new UnsupportedOperationException("Enum not supported");
        }
    }
}
