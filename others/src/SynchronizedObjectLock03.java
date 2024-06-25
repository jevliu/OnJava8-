/**
 * @author 刘季伟
 * @implNote 展示Synchronized 的方法锁形式：修饰普通方法，锁对象为this
 * @since 2024/6/25 10:27:23
 */
public class SynchronizedObjectLock03 implements Runnable{
    static SynchronizedObjectLock03 instance = new SynchronizedObjectLock03();

    @Override
    public void run(){
        method();
    }

    public synchronized void method(){
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
    }
}
