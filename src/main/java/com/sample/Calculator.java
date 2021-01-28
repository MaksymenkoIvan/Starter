package com.sample;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(add(5,6));
        System.out.println(subtraction(6,5));
        System.out.println(add(Integer.MAX_VALUE, 1));
    }

    public static int add(int a, int b){
        long c = (long) a + (long) b;
        if ((int)c != c) {
            throw new IllegalArgumentException("Not allowed parameter");
        }
        return (int) c;
    }

    public static int subtraction(int a, int b){
        long c = (long) a - (long) b;
        if ((int)c != c) {
            throw new IllegalArgumentException("Not allowed parameter");
        }
        return (int) c;
    }
}
