package JavaSE.抽象类及接口演示;

public abstract class 子类Person1 extends 父类Person {  //父类是抽象类时，子类也需要抽象；
    String hobby;

    public 子类Person1(String name, String sex, int age, String hobby) {
        super(name, sex, age);
        this.hobby = hobby;
    }

    public String getHobby(){
        return this.hobby;
    }

}
