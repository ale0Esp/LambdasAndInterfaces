package Leeson2.mainClasses;

import Leeson2.interfaces.Operations;

public class OperationLambda {

    public static void main(String[] args) {
        Operations op = (x, y) -> {
            System.out.println(x + y);
        };
        myMethod((x,y)-> System.out.println(x-y), 2,93);
    }

    public static void myMethod(Operations op, int x, int y) {
        op.printOperation(x, y);
    }
}
