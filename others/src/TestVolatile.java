import java.util.concurrent.TimeUnit;

/**
 * @author 刘季伟
 * @implNote 展示如何通过volatile 来解决不同线程间的可见性问题
 * 此例中Thread A一直在loop, 因为Thread A 由于可见性原因看不到Thread Main 已经修改stop的值
 * 通过在stop变量前面加上volatile关键字则会真正stop
 * @since 2024/6/24 22:15:14
 */
public class TestVolatile {
    private static volatile boolean  stop = false;

    public static void main(String[] args) {
        // Thread-A
        new Thread("Thread-A"){
            @Override
            public void run(){
                while (!stop){
                    //
                }
                System.out.println(Thread.currentThread() + " stopped");
            }
        }.start();

        // Thread-main
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread() + " after 1 seconds");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        stop = true;
    }
}
