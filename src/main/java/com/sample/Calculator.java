package com.sample;

public class Calculator
{
    public static void main( String[] args ){
        System.out.println(sum(9,6));
    }

    public static int sum(long a, long b){
        if (a + b > Integer.MAX_VALUE | a + b < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Not allowed parameter");
        }else return (int) (a+b);
    }

    public static int subtraction(long a, long b){
        if (a - b > Integer.MAX_VALUE | a - b < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Not allowed parameter");
        }else return (int) (a-b);
    }
}
