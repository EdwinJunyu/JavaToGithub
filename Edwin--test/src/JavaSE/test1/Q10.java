package JavaSE.test1;
//Write a Java program to find the maximum and minimum value of an array.
public class Q10 {
    public static void maxAndMinumumQ10(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max is " + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Min is " + min);
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Q10.maxAndMinumumQ10(test);
    }
}
