package 临时软件包.代码库;

public class 水仙花数 {
    public static void main(String[] args){
        for (int i = 100; i < 1000; i++){
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (a * a * a + b * b * b + c * c * c == i)
                System.out.println(i + " 是水仙花数！");
        }
    }
}
