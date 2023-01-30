package 临时软件包;

import java.util.Arrays;

public class 冒泡排序实战 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,7,2,9,0,6,1,8,4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j + 1];  //tmp储存第二个数
                    arr[j + 1] = arr[j]; // 交换两个数的位置
                    arr[j] = tmp;
                    flag =true;
                }
            }
            if(!flag) break;  //line13,14 优化程序
        }
    }
}
