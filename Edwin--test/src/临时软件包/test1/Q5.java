package 临时软件包.test1;
//Write a Java program to test if an array contains a specific value.
public class Q5 {
    public static void targetQ5(int[] arr, int target){
        for (int value: arr)
            if (value == target) {
                System.out.println(target + " is the target value");
                break;
            }
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Q5.targetQ5(test, 3);
    }
}
