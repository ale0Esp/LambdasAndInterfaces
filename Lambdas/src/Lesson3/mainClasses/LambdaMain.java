package Lesson3.mainClasses;

import Lesson3.interfaces.ICalculator;

public class LambdaMain {
    public static void main(String[] args) {
        
        engine((x,y)-> x+y);
        engine((x,y)-> x*y);
        engine((x,y)-> x/y);
        engine((x,y)-> x-y);
    }
    
    private static void engine(ICalculator iCA){
        int x = 2, y = 4;
        int rest = iCA.calculate(x, y);
        System.out.println("rest = " + rest);
    }
}
