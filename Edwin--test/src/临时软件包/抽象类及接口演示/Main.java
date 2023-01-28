package 临时软件包.抽象类及接口演示;  //抽象类看子类1

public class Main{
    public static void main(String[] args) {
        子类Person2 object1 = new 子类Person2("name", "sex", 18, "hobby") {
            public String getName() {
                return "getName方法在父类中定义为抽象，\n所以子类一定要调用，\n这里返回的值是：" + name;
            }
        };
        String GetName = object1.getName();
        System.out.println(GetName);
    }
}
