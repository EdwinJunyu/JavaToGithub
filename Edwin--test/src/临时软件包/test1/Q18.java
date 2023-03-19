package 临时软件包.test1;

public class Q18 {
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i < secondSmallest && i != smallest) {
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        int value = Q18.findSecondSmallest(test);
        System.out.println(value);
    }
}
