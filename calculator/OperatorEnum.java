package calculator;

import java.util.Arrays;

public enum OperatorEnum {
    DIVIDE('A'),
    MULTIPLY('B'),
    SUBTRACT('C'),
    SUM('D'),
    UNKNOWN('x');
    int value;
    OperatorEnum(int value) {
        this.value = value;
    }
    public static final OperatorEnum getByValue(int value){
        return Arrays.stream(OperatorEnum.values()).filter(enumRole -> enumRole.value == value).findFirst().orElse(UNKNOWN);
    }

}
