package BinaryOp;

import java.util.function.BinaryOperator;

public class BinaryOptest {
    public static void main(String[] args) {
        BinaryOperator<Integer> bo = (x,y)->x*y;
        System.out.println(bo.apply(4, 5));
        BinaryOperator<Integer> boMin = BinaryOperator.minBy((Integer x, Integer y)->x.compareTo(y));
        System.out.println(boMin.apply(4, 9));
        BinaryOperator<Integer> boMax = BinaryOperator.maxBy((Integer x, Integer y)->x.compareTo(y));
        System.out.println(boMax.apply(4, 9));
    }
}
