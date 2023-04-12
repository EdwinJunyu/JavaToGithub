package JavaSE.草稿;

public class 备用4 {
    public static void main(String[] args) {
    }

    public static class 备用2 {    /*备用2移动到了备用4*/
        public String name = "";
        public int num = 0;
        public int num1;
        public int num2;
        public 备用2(String Name, int Num){
            name = Name;
            num = Num;
        }

        public void print() {
            System.out.println("num is " + num);;
        }

        public int plus(int a, int b){
            a = num1;
            b = num2;
            return a+b;
        }

        public static void main(String[] args) {
            备用2 aa = new 备用2("me", 1);
            aa.print();
            int Plus = aa.plus(1,6);
            System.out.println(Plus);
            System.out.println("hi");


        }
    }
}
