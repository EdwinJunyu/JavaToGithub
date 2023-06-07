package JavaSE.内部类;

public class Test1 {
    public class Inner{  //
                         //  内部类
    }                    //

    public static void main(String[] args) {
        Test1 test = new Test1();
        Test1.Inner inner = test.new Inner();  //新建内部类的方法
    }
}
