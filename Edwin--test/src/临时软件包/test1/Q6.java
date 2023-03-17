package 临时软件包.test1;
//Write a Java program to find the index of an array element.
public class Q6 {
    public static void findIndexQ6(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Q6.findIndexQ6(test, 3);
    }
}
