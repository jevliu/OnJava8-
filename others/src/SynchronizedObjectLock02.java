import javax.crypto.spec.PSource;

/**
 * @author 刘季伟
 * @implNote 展示Synchronized 关键字使用示例02
 * @since 2024/6/25 10:15:12
 */
public class SynchronizedObjectLock02 implements Runnable{
    static SynchronizedObjectLock02 instace = new SynchronizedObjectLock02();
    // 创建两把锁
    Object block1 = new Object();
    Object block2 = new Object();

    @Override
    public void run(){
        // 这个代码使用的是第一把锁，当它释放后，后面的代码块由于使用的是第二把锁因此可以马上执行
        synchronized (block1){
            System.out.println("block1锁，我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("block1锁，" + Thread.currentThread().getName());
        }

        synchronized (block2){
            System.out.println("block2锁，我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("block2锁，" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instace);
        Thread t2 = new Thread(instace);
        t1.start();
        t2.start();
    }
}
