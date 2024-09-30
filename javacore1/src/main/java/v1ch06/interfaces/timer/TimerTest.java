package v1ch06.interfaces.timer;
/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/30 10:43:41
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the timer once every 10 seconds
        javax.swing.Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
