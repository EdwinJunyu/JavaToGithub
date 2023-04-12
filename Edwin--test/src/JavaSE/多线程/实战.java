package JavaSE.多线程;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class 实战 {
    private static Queue<Object> queue = new LinkedList<>();
    public static void main(String[] args) {
        new Thread(实战::add, "厨师1").start();
        new Thread(实战::add, "厨师2").start();
        new Thread(实战::add, "厨师3").start();
        new Thread(实战::add, "厨师4").start();
        new Thread(实战::add, "厨师5").start();

        new Thread(实战::take, "消费者1").start();
        new Thread(实战::take, "消费者2").start();
        new Thread(实战::take, "消费者3").start();
        new Thread(实战::take, "消费者4").start();
        new Thread(实战::take, "消费者5").start();
        new Thread(实战::take, "消费者6").start();
        new Thread(实战::take, "消费者7").start();
        new Thread(实战::take, "消费者8").start();
    }

    private static void add(){
        while (true){
            try {
                Thread.sleep(3000);
                synchronized (queue){
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "出餐了！");
                    queue.offer(new Object());
                    queue.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void take(){
        while (true) {
            try {
                synchronized (queue) {
                    while (queue.isEmpty()) queue.wait();
                    queue.poll();
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "拿到了餐品，正在享用！");
                }
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
