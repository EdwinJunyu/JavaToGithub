package JavaSE.多线程;

import java.util.Timer;
import java.util.TimerTask;

public class 定时器 {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我是延迟任务");
            }
        }, 1000, 1000);
        Thread.sleep(5000); //相当于运行5次
        timer.cancel();
    }
}
