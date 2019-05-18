package threadfor.notify;

import java.util.List;
import java.util.Random;

/**
 * 生产者
 *
 * @author MacBook
 *
 */
public class Producer implements Runnable {
    private List<PCData> queue;
    private int length;

    public Producer(List<PCData> queue, int length) {
        this.queue = queue;
        this.length = length;
    }

    @Override
    public void run() {
        try {
            while (true) {

                if (Thread.currentThread().isInterrupted())
                    break;
                Random r = new Random();
                long temp = r.nextInt(100);
                PCData data = new PCData();
                data.set(temp);
                synchronized (queue) {
                    if (queue.size() >= length) {
                        System.out.println("生产者满了"+queue.size());
                        queue.notifyAll();
                        queue.wait();
                    } else {
                        System.out.println(Thread.currentThread().getId() + " 生产了：" + temp);
                        queue.add(data);
                    }
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
