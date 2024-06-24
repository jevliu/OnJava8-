/**
 * @author 刘季伟
 * @implNote 展示实现模板方法runOps() 的使用示例
 * @since 2024/4/27 10:04:41
 */
import javax.swing.plaf.PanelUI;
import java.util.*;

class Bing implements Operations{
    @Override
    public void execute(){
        Operations.show("Bing");
    }
}
class Crack implements Operations{
    @Override
    public void execute(){
        Operations.show("Crack");
    }
}
class Twist implements Operations{
    @Override
    public void execute(){
        Operations.show("Twist");
    }
}
public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist()
        );
    }
}
