package JavaSE.抽象类及接口演示;

public abstract class 父类Person {
    String name;
    String sex;
    int age;

    public abstract String getName(); //抽象类没有方法体；

    public String getSex(){
        return sex;
    }

    public int getAge(){
        return age;
    }

    public 父类Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
