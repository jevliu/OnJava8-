package innerclasses.controller;
import java.time.*;
/**
 * @author 刘季伟
 * @implNote 展示应用程序框架中的事件
 * @since 2024/4/27 19:05:54
 */
public abstract class Event {
    private Instant enentTime;
    protected final Duration delayTime;
    public Event(long millisecondDelay){
        delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }
    public void start(){
        // 允许实现重启
        enentTime = Instant.now().plus(delayTime);
    }
    public boolean ready(){
        return Instant.now().isAfter(enentTime);
    }
    public abstract void action();
}
