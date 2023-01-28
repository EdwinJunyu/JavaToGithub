package 临时软件包.Mosh_1to2;

import java.util.Scanner;
public class C2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字: ");
        int num = scan.nextInt();
        if (num > 10) {
            System.out.println("This number bigger than ten");
        } else if (num < 10) {
            System.out.println("This number smaller than ten");
        } else if (num == 10) {
            System.out.println("This number equal ten");
        }
    }
        //System.out.println(num);
    }