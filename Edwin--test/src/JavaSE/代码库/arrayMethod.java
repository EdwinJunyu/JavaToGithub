package JavaSE.代码库;

import java.util.Arrays;

public class arrayMethod {
    public static void main(String[] args) {
        //toString 方法可以直接答应数组（不需要for遍历）
        int[] arr = new int[]{1,4,9,11,23,50,21,6,8,3,5,6,2};
        System.out.println(Arrays.toString(arr));  //直接sout

        Arrays.sort(arr);  //sort 排序
        System.out.println(Arrays.toString(arr));

        int[] array = new int[10];
        Arrays.fill(array,66);  //快速填充数组
        System.out.println(Arrays.toString(array));
    }
}
