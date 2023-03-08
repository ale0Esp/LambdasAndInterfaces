
package Lesson4.mainClasses;

import Lesson4.Interfaces.ICalculatorLong;


public class MainClass {
    public static void main(String[] args) {
        
        System.out.println(calLong().calculated(5l, 9l));
        
    }
    private static ICalculatorLong calLong(){
        return ((x,y) ->x*y);
    }
}
