package 临时软件包.代码库;

public class 斐波那契数列 {
    public static void main(String[] args) {
        int target = 10, result;

        int a = 1, b = 1, tmp;
        for (int i = 1; i < target; i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        result = a;
        System.out.println(result);
    }
}
