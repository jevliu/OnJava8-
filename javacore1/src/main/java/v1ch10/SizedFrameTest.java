package v1ch10;
import java.awt.*;
import javax.swing.*;
/**
 * @author 刘季伟
 * @implNote 设置框架大小和修改图标
 * @since 2024/10/18 20:13:08
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new SizedFrame();
            frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SizedFrame extends JFrame {
    public SizedFrame() {
        // 获取主机屏幕的尺寸
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // 设置frame的尺寸，并告知窗口系统定位框架
        setSize(screenWidth / 2, screenHeight /2);
        setLocationByPlatform(true);

        // 设置frame的图标
        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}