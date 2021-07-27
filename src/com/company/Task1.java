package com.company;

public class Task1 {
private Task1(){}
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || order == null || array.length == 0) throw new IllegalArgumentException();
        boolean ifsorted = false;
        int correct = 0;
        if (order == SortOrder.ASC)
        {
            for (int i = 0; i<array.length-1; i++)
            {
                if (array[i]<=array[i+1])
                {
                    correct++;
                }
            }
            ifsorted = correct == array.length - 1;
        }
        if (order == SortOrder.DESC)
        {
            for (int i = 0; i<array.length-1; i++)
            {
                if (array[i]>=array[i+1])
                {
                    correct++;
                }
            }
            ifsorted = correct == array.length - 1;
        }
        return ifsorted;
    }
}