package 临时软件包.继承;

public class Main {
    public static void main(String[] args) {
        父类Person person = new 父类Person("Edwin", "male", 18);
        继承Person newPerson = new 继承Person("Edwin", "male", 18, "play");
        if(person instanceof 父类Person){   //instanceof关键词判断是哪个类
            System.out.println("是父类Person的类");
        }

        String hobby = newPerson.getHobby();
        System.out.println("继承父类中的hobby是：" + hobby);
    }
}
