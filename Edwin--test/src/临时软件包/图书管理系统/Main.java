package 临时软件包.图书管理系统;
import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Book> LIST = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("正在初始化图书管理系统");
        load();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================图书管理系统================");
            System.out.println("1.录入书籍信息");
            System.out.println("2.查阅书籍信息");
            System.out.println("3.修改书籍信息");
            System.out.println("4.删除书籍信息");
            System.out.println("5.退出管理系统");
            System.out.println("==========================================");

            switch (scanner.nextInt()) {
                case 1 -> insert(scanner);
                case 2 -> list();
                case 3 -> modify(scanner);
                case 4 -> delete(scanner);
                case 5 -> {
                    System.out.println("正在保存数据...");
                    save();
                    System.out.println("感谢您的使用，再见！");
                    return;
                }
                default -> System.out.println("非法输入 程序结束");
            }
        }
    }

    private static void save(){
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("data"))){
            stream.writeObject(LIST);
            stream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void load(){
        File file = new File("data");
        if (file.exists()){
            try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file) )){
                LIST = (List<Book>) stream.readObject();
            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        } else {
            LIST = new LinkedList<>();
        }
    }

    public static void insert(Scanner scanner) {
        scanner.nextLine();
        System.out.println("请输入书籍名称");
        String title = scanner.nextLine();
        System.out.println("请输入书籍作者");
        String author = scanner.nextLine();
        System.out.println("请输入书籍价格");
        try {
            int price = scanner.nextInt();
            scanner.nextLine();
            临时软件包.图书管理系统.Book book = new 临时软件包.图书管理系统.Book(title, author, price);
            LIST.add(book);
            System.out.println(book);
        } catch (InputMismatchException e) {
            System.out.println("输入的价格不是一个合法的整数，请重新输入。");
            scanner.nextLine();
        }
    }

    private static void list(){
        for (int i = 0; i < LIST.size(); i++){
            System.out.println(i + ". " + LIST.get(i));
        }
    }

    private static void delete(Scanner scanner){
        scanner.nextLine();
        System.out.print("请输入你要删除的书籍ID：");
        int index = scanner.nextInt();
        scanner.nextLine();
        while (index > LIST.size() - 1 || index < 0){
            System.out.println("没有对应书籍，请重新输入：");
            index = scanner.nextInt();
            scanner.nextLine();
        }
        LIST.remove(index);
        System.out.println("删除书籍信息成功！");
    }

    private static void modify(Scanner scanner){
        scanner.nextLine();
        System.out.print("请输入你要修改的书籍ID：");
        int index = scanner.nextInt();
        scanner.nextLine();
        while (index > LIST.size() - 1 || index < 0){
            System.out.println("没有对应书籍，请重新输入：");
            index = scanner.nextInt();
            scanner.nextLine();
        }

        Book book = LIST.get(index);
        System.out.println("请输入书籍名称");
        book.setTitle(scanner.nextLine());
        System.out.println("请输入书籍作者");
        book.setAuthor(scanner.nextLine());
        System.out.println("请输入书籍价格");
        book.setPrice(scanner.nextInt());

        System.out.println("书籍信息修改成功！");
    }
}
