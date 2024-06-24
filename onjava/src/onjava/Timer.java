package onjava;
import static java.util.concurrent.TimeUnit.*;
/**
 * @author 刘季伟
 * @implNote
 * @since 2024/6/23 18:48:51
 */
public class Timer {
    private long start = System.nanoTime();
    public long duration(){
        return NANOSECONDS.toMillis(
                System.nanoTime() - start
        );
    }
    public static long duration(Runnable test){
        Timer timer = new Timer();
        test.run();
        return timer.duration();
    }
}
