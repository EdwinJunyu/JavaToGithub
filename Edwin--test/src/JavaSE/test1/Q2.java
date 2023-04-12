package JavaSE.test1;
//Write a Java program to sum values of an array.
public class Q2 {

    public static int sumQ2(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println(Q2.sumQ2(test));
    }
}
