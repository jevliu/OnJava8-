import java.util.regex.*;
/**
 * @author 刘季伟
 * @implNote 使用一个类来展示如何测试正则表达式的有效性。
 * @since 2024/8/14 15:51:01
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println(
                    "Usage:\njava TestRegularExpression characterSequence " +
                            "regularExpression+"
            );
            System.exit(0);
        }
        System.out.println("Input:\"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg +"\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.group() + "-" + (m.end() - 1));
            }
        }

        Matcher m = Pattern.compile("\\w+").matcher("Evening is " +
                "full of the linnet's wings");
        while (m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
