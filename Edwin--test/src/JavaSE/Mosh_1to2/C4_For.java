package JavaSE.Mosh_1to2;

public class C4_For {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello World");
        }
        int sum = 0;
        for(int a = 10; a > 0; a--){
            if(a % 2 == 1){
                System.out.println("This is odd number: " + a);

            }
             sum += a;
        }
             System.out.println("the total odd number is " + sum);
    }
}
