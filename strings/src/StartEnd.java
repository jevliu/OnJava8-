import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Map;
import java.util.regex.*;
/**
 * @author 刘季伟
 * @implNote 展示正则表达式中的matches()和lookingAt()的用法。
 * @since 2024/8/14 17:18:19
 */
public class StartEnd {
    public static String input =
            """
                    As long as there is injustice, whenever a
                    Targathian baby cries out, wherever a distress
                    signal sounds among the stars ...We'll be there.
                    This fine ship, and this fine crew ...
                    Never give up! Never surrender!""";

    public static class Display {
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex){this.regex = regex;}

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            d.display("find() '" + m.group() + "' start = " +
                    m.start() + " end = " + m.end());
        }
        if (m.lookingAt())
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        if (m.matches())
            d.display("matches() start = " + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            System.out.println("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*",
            "\\w*ever", "T\\w+", "Never.*?!"})
                examine(in, regex);
        }
    }
}
