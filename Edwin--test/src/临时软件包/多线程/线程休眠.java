package 临时软件包.多线程;

public class 线程休眠 {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> { //创建线程
            System.out.println("我是线程A");
            int sum = 0;
            for (int i = 1; i <= 20; i++) {
                System.out.println("线程A运行中...");
                sum += i;
            }

        });

        Thread threadB = new Thread(() -> { //创建线程
            System.out.println("我是线程B");
            int sum = 0;
            for (int i = 1; i <= 20; i++) {
                System.out.println("线程B运行中...");
                sum += i;
            }
        });
        threadA.start();
        threadB.start();


        try {   // 每一秒钟休眠一次（1000 millis = 1 second）
            Thread.sleep(1000);
            System.out.print("H");
            Thread.sleep(1000);
            System.out.print("e");
            Thread.sleep(1000);
            System.out.print("l");
            Thread.sleep(1000);
            System.out.print("l");
            Thread.sleep(1000);
            System.out.println("o");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread threadAA = new Thread(() -> {
            System.out.println("线程开始！");
            Thread.currentThread().suspend();  //暂停此线程
            System.out.println("线程继续开始！");
        });
        threadAA.start();
        try {
            Thread.sleep(3000);
            threadAA.resume();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
