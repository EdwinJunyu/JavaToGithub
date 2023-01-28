package 临时软件包.Mosh_1to2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array入门 {
    public static void main(String[] args) {
        System.out.println("==========一维数组=========");
        int[] numbers_1 = {1,2,3,4};

        System.out.println(Arrays.toString(numbers_1));

        int[] numbers_2 = {1,3,5,4,7,2,9,8};
        Arrays.sort(numbers_2);

        System.out.println(Arrays.toString(numbers_2));
        System.out.println("==========多维数组=========");

        int[][] numbers_3 = {{1,2,3},{1,2,3}};

        System.out.println(Arrays.deepToString(numbers_3));

    }
}
