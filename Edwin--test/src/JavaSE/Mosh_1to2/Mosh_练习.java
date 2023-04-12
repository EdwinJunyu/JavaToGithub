package JavaSE.Mosh_1to2;
import java.util.Scanner;

public class Mosh_练习 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("interest rate: ");
        double interestRate = scan.nextDouble();
        System.out.println("months: ");
        int months = scan.nextInt();
        System.out.println("basicMoney: ");
        double basicMoney = scan.nextDouble();
        double payment = (interestRate * Math.pow(1 + interestRate, months))/(Math.pow(1 + interestRate, months)-1) * basicMoney;
        System.out.println("You should pay: " + payment);

//月利息需要转换到年利息


    }
}
