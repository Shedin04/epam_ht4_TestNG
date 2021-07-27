package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a ={5, 3, 3};
        int[] b ={15, 10, 3};
        System.out.println(Task1.isSorted(a,SortOrder.DESC));
        System.out.println(Task2.transform(b,SortOrder.DESC));
        System.out.println(Task3.multiArithmeticElements(10, -4, 20));
        System.out.println(Task4.sumGeometricElements(100, 0.5, 0));
    }
}