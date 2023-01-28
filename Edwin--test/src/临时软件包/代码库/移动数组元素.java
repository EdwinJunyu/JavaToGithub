package 临时软件包.代码库;

public class 移动数组元素 {
    public static void main(String[] args) {
        System.out.println("--------向右平移----------");
        int[] value1 = {6, 2, 1, 7, 12, 5};
        int last = value1[value1.length - 1];

        for(int i = value1.length-1; i > 0; i--) {
            value1[i] = value1[i-1];
        }
        value1[0] = last;
        for (int val : value1)
        {
            System.out.print(val + " ");
        }

        System.out.println("\n--------向左平移----------");

        int[ ] value2 = {6, 2, 1, 7, 12, 5};
        int first = value2[0];
        for (int i = 0; i < value2.length; i++)
        {
            if (i < value2.length - 1)
            {
                value2[i] = value2[i+1];
            }
            else {
                // last element gets first
                value2[i] = first;
            }
        }
        for (int val : value2)
        {
            System.out.print(val + " ");
        }
    }
}
