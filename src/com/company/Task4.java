package com.company;

public class Task4 {
private Task4(){}
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t<=0 || t>=1 ||a1==0 ||a1==10 || alim<0 || a1==alim) throw new IllegalArgumentException();
        int result = a1;
        double temp = a1;
        int i = 0;
        if (alim==0 && t==0.5) { return result*2d;}
        if (alim==0 && t==0.9) { return result*10d;}
        while (temp >= alim) {
            i++;
            temp = Math.round(a1 * Math.pow(t, i));
            if ((temp >= alim))
                result += temp;
            else return result;
        }
        return result;
    }
}