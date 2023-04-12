package JavaSE.多线程;

public class 线程创建 {
    public static void main(String[] args) { //主线程

        Thread threadA = new Thread(() -> { //创建线程
            System.out.println("我是线程A");
            int sum = 0;
            for (int i = 1; i <= 50; i++) {
                sum += i;
            }
            System.out.println("1-50的和为：" + sum);
        });


        Thread threadB = new Thread(() -> { //创建线程
            System.out.println("我是线程B");
            int sum = 0;
            for (int i = 1; i <= 50; i++) {
                sum += i;
            }
            System.out.println("1-50的和为：" + sum);
        });

        Thread threadC = new Thread(() -> { //创建线程
            System.out.println("我是线程C");
            int sum = 0;
            for (int i = 1; i <= 20; i++) {
                System.out.println("线程C运行中...");
                sum += i;
            }

        });

        Thread threadD = new Thread(() -> { //创建线程
            System.out.println("我是线程D");
            int sum = 0;
            for (int i = 1; i <= 20; i++) {
                System.out.println("线程D运行中...");
                sum += i;
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
