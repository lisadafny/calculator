package calculator.unknown;

public class UnknownOperatorImpl implements UnknownOperator{
    @Override
    public int calculate(int a,int b){
        System.err.println("ERROR: not recognized");
        return 0;
    }
}
