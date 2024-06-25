/**
 * @author 刘季伟
 * @implNote synchronized 修饰普通方法
 * @since 2024/6/25 10:33:22
 */
public class SynchronizedObjectLock04 implements Runnable{
    static SynchronizedObjectLock04 instance1 = new SynchronizedObjectLock04();
    static SynchronizedObjectLock04 instance2 = new SynchronizedObjectLock04();

    @Override
    public void run(){
        method();
    }

    // synchronized 用在普通方法上，默认的锁是this,当前实例
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
        // t1 和 t2 对应的this是两个不同的实例，所以代码不会串行
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
    }

}
