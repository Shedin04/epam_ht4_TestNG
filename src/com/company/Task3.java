package com.company;

public class Task3 {
private Task3(){}
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        int result = a1;
        if (n<=0) throw new IllegalArgumentException();
        for (int i=1; i<n; i++)
        {
            result=result*(a1+t*i);
        }
        return result;
    }
}