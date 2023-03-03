package 临时软件包.图书管理系统;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString() {
        return"=================\n书籍名称《"+title+"》\n作者：" + author +"\n价格：¥" + price + "\n=================";
    }
}
