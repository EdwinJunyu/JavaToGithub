package JavaSE.抽象类及接口演示;

public abstract class 子类Person2 extends 父类Person {   //父类是抽象类时，子类也需要抽象；
    String hobby;

    public 子类Person2(String name, String sex, int age, String hobby) {
        super(name, sex, age);
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }

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
