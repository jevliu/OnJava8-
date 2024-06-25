/**
 * @author 刘季伟
 * @implNote 展示什么是可重入，加锁次数计数器
 * @since 2024/6/25 11:12:07
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        demo.method1();
    }

    private synchronized void method1(){
        System.out.println(Thread.currentThread().threadId() + ": method1()");
        method2();
    }

    private synchronized void method2(){
        System.out.println(Thread.currentThread().threadId() + ": method2()");
        method3();
    }

    private synchronized void method3(){
        System.out.println(Thread.currentThread().threadId() + ": method3()");
    }
}
