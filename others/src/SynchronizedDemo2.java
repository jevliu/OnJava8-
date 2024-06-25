/**
 * @author 刘季伟
 * @implNote 通过深入JVM看字节码，来了解synchronized加锁的原理
 * @since 2024/6/25 11:03:02
 */
public class SynchronizedDemo2 {
    Object object = new Object();
    public void method1(){
        synchronized (object){}
        method2();
    }

    private static void method2(){}
}
