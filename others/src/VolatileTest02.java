/**
 * @author 刘季伟
 * @implNote 展示volatile 是如何通过内存屏障来实现线程间的可见性的
 * @since 2024/6/24 22:36:57
 */
public class VolatileTest02 {
    private volatile int a;
    public void update(){
        a = 1;
    }

    public static void main(String[] args) {
        VolatileTest02 test02 = new VolatileTest02();
        test02.update();
    }
}
