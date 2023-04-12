package JavaSE.test1;
//Write a Java program to calculate the average value of array elements.

public class Q4 {
    public static double averageQ4(int[] arr){
        int sum = 0;
        int counter = 0;

        for (int i : arr) {
            sum += i;
            counter++;
        }
        return sum / counter;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println(Q4.averageQ4(test));

    }
}
