package JavaSE.继承;

public class 父类Person {
    String name;
    String sex;
    int age;

    public String getName(){
        return name;
    }

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

    public static void main(String[] args) {
        父类Person person = new 父类Person("Edwin", "male", 18);
        int Age = person.getAge();
        String Name = person.getName();
        String Sex = person.getSex();

        System.out.println("姓名：" + Name);
        System.out.println("性别：" + Sex);
        System.out.println("年龄：" + Age);

    }
}
