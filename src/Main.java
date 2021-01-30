import function.factory.FunctionFactory;
import function.functionEnum.FunctionEnum;
import function.functionInterface.Function;
import rule.basicIntegrationRule.Rule;
import rule.factory.RuleFactory;
import rule.ruleEnum.RuleEnum;

public class Main {

    public static void main(String args[])
    {
        /* Initial Values */
        final FunctionEnum functionEnum = FunctionEnum.FUNCTION_1;
        final RuleEnum ruleEnum = RuleEnum.TRAPEZOID_RULE;
        final int stepsNumber = 4;
        final double begin = 1.0, end = 5.0;
        /* End of Initial */

        FunctionFactory functionFactory = new FunctionFactory();
        Function function = functionFactory.createFunction(functionEnum);
        RuleFactory ruleFactory = new RuleFactory();
        Rule rule = ruleFactory.createRule(stepsNumber, begin, end, function, ruleEnum);

        System.out.println
                (
                        "----- INTEGRAL FROM " + begin + " TO " + end + " -----\n"
                        + "Function: " + function.getName() + '\n'
                        + "Method: " + rule.getName() + '\n'
                        + "Result: " + rule.getIntegral()
                );
    }
}
