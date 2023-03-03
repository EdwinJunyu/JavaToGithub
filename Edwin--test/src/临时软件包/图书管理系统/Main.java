package 临时软件包.图书管理系统;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final List<Book> LIST = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================图书管理系统================");
            System.out.println("1.录入书籍信息");
            System.out.println("2.查阅书籍信息");
            System.out.println("3.录入书籍信息");
            System.out.println("4.删除书籍信息");
            System.out.println("5.退出管理系统");
            System.out.println("==========================================");

            switch (scanner.nextInt()) {
                case 1 -> insert(scanner);
                case 5 -> {
                    System.out.println("感谢您的使用，再见！");
                    return;
                }
                default -> System.out.println("非法输入 程序结束");
            }
        }
    }

    public static void insert(Scanner scanner) {
        scanner.nextLine();
        System.out.println("请输入书籍名称");
        String title = scanner.nextLine();
        System.out.println("请输入书籍作者");
        String author = scanner.nextLine();
        System.out.println("请输入书籍价格");
        int price = scanner.nextInt();
        scanner.nextLine();
        临时软件包.图书管理系统.Book book = new 临时软件包.图书管理系统.Book(title, author, price);
        LIST.add(book);
        System.out.println(book);
    }
}
