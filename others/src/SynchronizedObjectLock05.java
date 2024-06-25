/**
 * @author 刘季伟
 * @implNote synchronized 修饰静态方法
 * @since 2024/6/25 10:39:25
 */
public class SynchronizedObjectLock05 implements Runnable{
    static SynchronizedObjectLock05 instance1 = new SynchronizedObjectLock05();
    static SynchronizedObjectLock05 instance2 = new SynchronizedObjectLock05();

    @Override
    public void run(){
        method();
    }

    // 修饰静态方法，默认的锁就是当前的Class类，所以无论哪个线程访问它，需要的锁只有一把
    public static synchronized void method(){
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
    }
}