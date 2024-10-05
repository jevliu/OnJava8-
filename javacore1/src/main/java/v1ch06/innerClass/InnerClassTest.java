package v1ch06.innerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @author 刘季伟
 * @implNote 展示内部类的基本用法
 * @since 2024/10/5 15:39:35
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

//        TalkingClock.TimePrinter listener = clock.new TimePrinter();

        // Keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock {
    private int interval;
    private boolean beep;

    /**
     * Construct a TalkingClock
     * @param interval the interval between message
     * @param beep true if the clock should beep
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Starts the clock
     */
    public void start() {
        // 2.Local InnerClass, only visible in start() method
        class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is: " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        ActionListener listener = new TimePrinter();

        // 3.Use anonymous inner class if only need to create one object of the inner class
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is: " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }

    /**
     * 1. inner class
     */
    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is: " + new Date());
            if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }

}
