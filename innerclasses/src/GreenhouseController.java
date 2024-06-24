/**
 * @author 刘季伟
 * @implNote 展示创建一个GreenhouseControls 对象，并添加各种不同的Event 对象来配置系统；命令设计模式的一个示例：eventList 中的每个对象都
 * 被封装乘对象的请求
 * @since 2024/4/27 19:59:41
 */
import innerclasses.controller.*;
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // 除了使用代码进行配置外，也可以从text文件中导入配置信息
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenhouseControls.Terminate(5000));
        gc.run();
    }
}
