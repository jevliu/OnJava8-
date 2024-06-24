/**
 * @author 刘季伟
 * @implNote 展示如何使用匿名内部类来处理GUI事件
 * @since 2024/6/22 13:34:46
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassExample4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // ... 其他GUI设置代码
    }
}
