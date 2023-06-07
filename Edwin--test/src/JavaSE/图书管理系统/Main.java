package JavaSE.图书管理系统;
import java.io.*;
import java.util.*;

public class Main {
    public static List<Book> LIST = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("正在初始化图书管理系统");
        load();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================图书管理系统================");
            System.out.println("1.录入书籍信息");
            System.out.println("2.查阅所有书籍信息");
            System.out.println("3.查阅特定书籍信息");
            System.out.println("4.修改书籍信息");
            System.out.println("5.删除书籍信息");
            System.out.println("6.退出管理系统");
            System.out.println("==========================================");

            try {
                switch (scanner.nextInt()) {
                    case 1 -> insert(scanner);
                    case 2 -> list();
                    case 3 -> bookSearch(scanner);
                    case 4 -> modify(scanner);
                    case 5 -> delete(scanner);
                    case 6 -> {
                        System.out.println("正在保存数据...");
                        save();
                        System.out.println("感谢您的使用，再见！");
                        return;
                    }
                    default -> System.out.println("非法输入，请再试一次：");
                }
            } catch (InputMismatchException e){
                System.out.println("非法输入，请再试一次：");
                scanner.nextLine();
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
            double price = scanner.nextInt();
            scanner.nextLine();
            JavaSE.图书管理系统.Book book = new JavaSE.图书管理系统.Book(title, author, price);
            LIST.add(book);
            System.out.println(book);
            System.out.println("书籍录入成功！");
        } catch (InputMismatchException e) {
            System.out.println("非法输入，请再试一次：");
            scanner.nextLine();
        }
    }

    private static void list(){
        for (int i = 0; i < LIST.size(); i++){
            System.out.println(i + ". " + LIST.get(i));
        }
    }

    private static String bookSearch(Scanner scanner){
        scanner.nextLine();
        System.out.print("请输入你要查找的书籍：");
        String title = scanner.nextLine();
        LIST.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        int left = 0;
        int right = LIST.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = LIST.get(mid).getTitle().compareTo(title);
            if (cmp == 0) {
                System.out.println("系统有" + LIST.get(mid).getTitle() + "这本书");
                return LIST.get(mid).getTitle();
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("系统没有查到这本书");
        return null;

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
