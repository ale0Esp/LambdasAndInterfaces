package Lesson2.main;

public class MainBifunction {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        String mul = "multo "+cal.calc((x,y)-> ":"+ (x*y), 991, 2);
        System.out.println( mul);
    }
}
