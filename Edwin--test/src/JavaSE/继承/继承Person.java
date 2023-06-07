package JavaSE.继承;

public class 继承Person extends 父类Person{

    public 继承Person(String name, String sex, int age) {
        super(name, sex, age);
    }

    String hobby;

    public 继承Person(String name, String sex, int age, String hobby) {
        super(name, sex, age);
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }

    public static void main(String[] args) {
        继承Person newPerson = new 继承Person("Edwin", "male", 18, "play");

    }
}
