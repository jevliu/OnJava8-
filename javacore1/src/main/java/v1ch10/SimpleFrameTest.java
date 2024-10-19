package v1ch10;
import java.awt.*;
import java.util.PropertyResourceBundle;
import javax.swing.*;
/**
 * @author 刘季伟
 * @implNote 演示在屏幕中显示一个空框架的简单程序
 * @since 2024/10/18 19:15:51
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        // 事件分派线程
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame(); // 构造一个可见的对象
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
//            frame.setUndecorated(true); // 关闭所有框架装饰
        });
    }
}

class SimpleFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
