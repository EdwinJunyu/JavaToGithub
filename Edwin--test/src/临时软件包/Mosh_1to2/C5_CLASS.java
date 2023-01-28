package 临时软件包.Mosh_1to2;

public class C5_CLASS {
    public static void main(String[] args){
        human h1 = new human();  //创建对象 h1
        h1.eat();        //h1调用 eat() 方法
        h1.run();

    }
}

class human{
    public void eat(){        //创建 eat() 方法
        System.out.println("Eat");
    }
    public void run(){
    System.out.print("They can ");
    System.out.println("run");}
}


