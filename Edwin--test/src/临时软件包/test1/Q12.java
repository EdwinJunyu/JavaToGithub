package 临时软件包.test1;
//Write a Java program to find the duplicate values of an array of integer values.
public class Q12 {
    public static void dupValueQ12(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i] + " is duplicate values.");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {1,2,2,3,4,5,5,6,7,8,9,8,10};
        Q12.dupValueQ12(test);
    }
}
