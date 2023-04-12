package JavaSE.test1;
//Write a Java program to find the second largest element in an array.
public class Q17 {
    public static int findSecondLargest(int[] arr) {
        int largest = 0;
        int secondLargest = 0;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] test = {1,2,2,3,4,5};
        int value = Q17.findSecondLargest(test);
        System.out.println(value);
    }
}
