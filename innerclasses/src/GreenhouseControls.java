import innerclasses.controller.*;

import javax.swing.plaf.PanelUI;

/**
 * @author 刘季伟
 * @implNote 展示继承自Controller 控制框架的一个典型实现：温室控制系统
 * @since 2024/4/27 19:18:30
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            light = true;
        }
        @Override
        public String toString(){
            return "Light is on";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            // 硬编码，执行关灯操作
            light = false;
        }
        @Override
        public String toString(){
            return "Light is off";
        }
    }
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            water = true;
        }
        @Override
        public String toString(){
            return "Greenhouse water is on";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            water = false;
        }
        @Override
        public String toString(){
            return "Greenhouse water is off";
        }
    }
    private String thermostat  = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            thermostat = "Night";
        }
        @Override
        public String toString(){
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            thermostat = "Day";
        }
        @Override
        public String toString(){
            return "Thermostat on day setting";
        }
    }
    // 一个调用action() 将其自身插入到eventlist中的示例
    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            addEvent(new Bell(delayTime.toMillis()));
        }
        @Override
        public String toString(){
            return "Bing";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList){
                addEvent(e);
            }
        }
        @Override
        public void action(){
            for (Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        @Override
        public String toString(){
            return "Restarting system";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            System.exit(0);
        }
        @Override
        public String toString(){
            return "Terminating";
        }
    }
}
