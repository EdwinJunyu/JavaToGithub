package 临时软件包;

public class 二分查找实战 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        System.out.println(二分查找实战.search1(arr, 9));
        System.out.println(二分查找实战.search2(arr, 3));
    }
    //普通方法：
    private static int search1(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (i == target)
                return arr[i];
        }
        return -1;
    }
    //二分查找：
    private static int search2(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int i = arr[mid];
            if(i < target)
                left = mid + 1;
            else if (i > target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
