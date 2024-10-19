package v1ch10;
import java.awt.*;
import java.util.PropertyResourceBundle;
import javax.naming.NamingEnumeration;
import javax.swing.*;
import javax.swing.plaf.PanelUI;

/**
 * @author 刘季伟
 * @implNote 在frame中添加一个文本组件
 * @since 2024/10/18 20:42:30
 */
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * 一个包含信息面板的框架
 */
class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }
}

/**
 * 一个展示信息的组件
 */
class NotHelloWorldComponent extends JComponent {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g) {
        Font sansbold14 = new Font("SansSerif", Font.BOLD, 14); // 添加字体
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(sansbold14); // 使用自定义的字体
        g2.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}