package Lesson4.mainClasses;

import Lesson4.Interfaces.*;

public class LambdaMain {
    
    public static void main(String[] args) {
       ICalculatorLong iCAl = (x,y)->x+y;
       engine(iCAl);
       engine((int x, int y)-> x+y); 
       engine((ICalculatorInt)(x,y)-> x+y); 
       
    }

    public static void engine(ICalculatorInt iCA) {
           //Todo
    }
    
    public static void engine(ICalculatorLong lCA) {
            //Todo
    }

}
