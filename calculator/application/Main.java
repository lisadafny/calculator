package calculator.application;

import calculator.Calculator;
import calculator.OperatorEnum;
import calculator.divide.DivideOperatorImpl;
import calculator.multiply.MultiplyOperatorImpl;
import calculator.subtract.SubtractOperatorImpl;
import calculator.sum.SumOperatorImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Calculator calculator = new Calculator(
                new DivideOperatorImpl(),
                new MultiplyOperatorImpl(),
                new SubtractOperatorImpl(),
                new SumOperatorImpl()
        );

        do {
            try {
                System.out.println("Type the first number of the operation");
                int a = s.nextInt();

                System.out.println("Type the second number of the operation");
                int b = s.nextInt();

                System.out.println("A for Divide, B for Multiply, C for Subtract, D for Addition");

                s.nextLine();
                OperatorEnum operatorEnum = OperatorEnum.getByValue(s.nextLine().charAt(0));


                System.out.println(calculator.calc(operatorEnum, a, b));
            } catch (Exception e) {
                System.err.println("ERROR: type only allowed characters");
                s.nextLine();
            }
        } while (true);


    }

}
