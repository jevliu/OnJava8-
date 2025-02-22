package v1ch06.lambda;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
/**
 * @author 刘季伟
 * @implNote
 * @since 2024/10/2 09:58:28
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"};

        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        // Keep program running until user selects OK
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
