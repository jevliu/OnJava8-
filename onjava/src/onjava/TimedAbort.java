package onjava;
import java.io.File;
import java.util.concurrent.*;
/**
 * @author 刘季伟
 * @implNote 设定程序停止运行的时间
 * @since 2024/4/16 11:21:33
 */
public class TimedAbort {
    private volatile boolean restart = true;

    public TimedAbort(double t, String msg){
        CompletableFuture.runAsync(() -> {
            try {
                while (restart) {
                    restart = false;
                    TimeUnit.MILLISECONDS.sleep((int) (1000 * t));
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(msg);
            System.exit(0);
        });
    }

    public TimedAbort(double t){this (t, "TimedAbort " + t);}

    public void restart(){restart = true;}
}
