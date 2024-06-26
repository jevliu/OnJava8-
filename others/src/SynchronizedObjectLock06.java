/**
 * @author 刘季伟
 * @implNote synchronized 指定锁对象为Class对象
 * @since 2024/6/25 10:44:37
 */
public class SynchronizedObjectLock06 implements Runnable {
    static SynchronizedObjectLock06 instance1 = new SynchronizedObjectLock06();
    static SynchronizedObjectLock06 instance2 = new SynchronizedObjectLock06();

    @Override
    public void run() {
        // 所有线程需要的锁都是同一把
        synchronized(SynchronizedObjectLock06.class){
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
    }
}
