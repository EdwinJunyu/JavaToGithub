package 临时软件包.草稿;

public class testStaticAndCommanMethod {
    public static void main(String[] args) {
        System.out.println(testStaticAndCommanMethod.plus(3,4));
        System.out.println(testStaticAndCommanMethod.getFirst());
        testStaticAndCommanMethod newTest = new testStaticAndCommanMethod(6, 2);
        int outCome = newTest.Minus();
        System.out.println(outCome);

    }
    public static int num;
    public static int first;
    public static int second;
    public static int plus(int initFirst, int initSecend){
        first = initFirst;
        second = initSecend;
        return first + second;
    }
    public static int getFirst(){
        return first;
    }
        int a;
        int b;

        /*以下是普通实例变量方法*/
    public testStaticAndCommanMethod(int f, int s) {
        a = f;
        b = s;
    }
    public int Minus(){
        return a - b;
    }
    int setF;
    int setS;
    public void setMinusNum(int sf, int ss){
        setF = sf;
        setS = ss;
    }
}
