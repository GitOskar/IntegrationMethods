package function.factory;

import function.Function1;
import function.Function2;
import function.Function3;
import function.functionEnum.FunctionEnum;
import function.functionInterface.Function;

public class FunctionFactory
{
    public Function createFunction(FunctionEnum functionEnum)
    {
        switch (functionEnum)
        {
            case FUNCTION_1: return new Function1();
            case FUNCTION_2: return new Function2();
            case FUNCTION_3: return new Function3();
            default: throw new UnsupportedOperationException("Enum not supported");
        }
    }
}
