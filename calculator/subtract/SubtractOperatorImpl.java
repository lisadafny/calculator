package calculator.subtract;

import calculator.Operator;

public class SubtractOperatorImpl implements SubtractOperator {
    @Override
    public int calculate(int a,int b){
        return a-b;
    }
}
