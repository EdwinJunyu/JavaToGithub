package 临时软件包;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 1, 3};
        int[] array2 = {0, 0, 0, 0};
        int a2 = 0;
        for (int a1=1; a1 < array1.length; a1++)
        {
            if (array1[a1] >= 2)
            {
                array2[a2] = array1[a1];
                a2++;
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(array2);
    }
}

