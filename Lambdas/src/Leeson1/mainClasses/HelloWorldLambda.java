package mainClasses;

import interfaces.FunctionTest;

public class HelloWorldLambda {
    public static void main(String[] args) {
        FunctionTest f = ()-> System.out.println("hello world");
        f.greet();
        HelloWorldLambda hWL = new HelloWorldLambda();
        hWL.tests(f);
    }
    
    public void tests(FunctionTest f){
        f.greet();
    }
}
