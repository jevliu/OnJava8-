package innerclasses.controller;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示了一个用来管理并触发事件的实际控制框架
 * @since 2024/4/27 19:11:44
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        while (!eventList.isEmpty()){
            // 为了避免破坏原容器，在这里进行一下复制
            for (Event e : new ArrayList<>(eventList)){
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
