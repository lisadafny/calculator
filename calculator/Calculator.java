package calculator;


import calculator.divide.DivideOperator;
import calculator.multiply.MultiplyOperator;
import calculator.subtract.SubtractOperator;
import calculator.sum.SumOperator;
import calculator.unknown.UnknownOperatorImpl;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    public Map<OperatorEnum, Operator> operatorMap;

    public Calculator(DivideOperator divideOperator,
                      MultiplyOperator multiplyOperator,
                      SubtractOperator subtractOperator,
                      SumOperator sumOperator) {
        operatorMap = new HashMap<>();
        operatorMap.put(OperatorEnum.DIVIDE,divideOperator);
        operatorMap.put(OperatorEnum.MULTIPLY,multiplyOperator);
        operatorMap.put(OperatorEnum.SUBTRACT,subtractOperator);
        operatorMap.put(OperatorEnum.SUM, sumOperator);
        operatorMap.put(OperatorEnum.UNKNOWN, new UnknownOperatorImpl());
    }
    public int calc(OperatorEnum operatorEnum, int a, int b){
        return operatorMap.get(operatorEnum).calculate(a,b);
    }
}