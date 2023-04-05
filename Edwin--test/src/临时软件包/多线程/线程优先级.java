package 临时软件包.多线程;

public class 线程优先级 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"开始运行！");
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName()+"打印："+i);
            }
            System.out.println("线程1结束！");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("线程2开始运行！");
            for (int i = 0; i < 50; i++) {
                System.out.println("2打印："+i);
                if(i == 10){
                    try {
                        System.out.println("线程1加入到此线程！");
                        t1.join();    //在i==10时，让线程1加入，先完成线程1的内容，在继续当前内容
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
