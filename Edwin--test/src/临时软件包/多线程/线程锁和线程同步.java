package 临时软件包.多线程;

public class 线程锁和线程同步 {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (线程锁和线程同步.class){  //使用synchronized关键字创建同步代码块
                    value++;
                }
            }
            System.out.println("线程1完成");
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (线程锁和线程同步.class){
                    value++;
                }
            }
            System.out.println("线程2完成");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);  //主线程停止1秒，保证两个线程执行完成
        System.out.println(value);
    }
}
