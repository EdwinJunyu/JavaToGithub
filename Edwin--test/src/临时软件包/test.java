package 临时软件包;
import java.util.Scanner;

public class test {
    public test(String name){
        System.out.println("名字： " + name);
    }

    int setAge;
    public void setAge(int age){
        setAge = age;
    }

    public int getAge(){
        System.out.println("年龄： " + setAge);
        return setAge;
    }

    public static void main(String[] args) {
        test Edwin = new test("Edwin");
        Edwin.setAge(10);
        Edwin.getAge();

        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();


    } //被删这个括号
} //被删这个括号




