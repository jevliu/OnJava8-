package v1ch10.draw;
import java.awt.*;
import java.awt.geom.*;
import java.util.PropertyResourceBundle;
import javax.swing.*;
/**
 * @author 刘季伟
 * @implNote 展示绘制一个矩形，这个矩形的内接椭圆，矩形的对角线以及以矩形中心为圆心的圆
 * @since 2024/10/18 21:08:01
 */
public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * 一个包含图形面板的框架
 */
class DrawFrame extends JFrame {
    public DrawFrame() {
        add(new DrawComponent());
        pack();
    }
}

/**
 * 展示矩形和椭圆的组件
 */
class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HIGHT = 400;
    private static final Color BACKGROUND_COLOR = new Color(240, 240, 2);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // 设置背景颜色
        g2.setColor(BACKGROUND_COLOR);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setPaint(new Color(0, 128, 128)); // 设置颜色，自定义为蓝绿色

        // 绘制矩形
        double leftX = 100;
        double topY = 100;
        double width = 200;
        double hight = 150;
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, hight);
        g2.draw(rect);
//       g2.fill(rect); // 在矩形内部填充颜色

        // 绘制矩形内接椭圆
        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rect);
        g2.draw(ellipse2D);

        // 绘制矩形的对角线
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + hight));

        // 绘制以矩形中心为圆心的圆
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
        g2.draw(circle);
    }

    public Dimension getPreferredSize(){return new Dimension(DEFAULT_WIDTH, DEFAULT_HIGHT);}
}