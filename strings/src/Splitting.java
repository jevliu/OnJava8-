import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示正则表达式中的split()用法——将字符串从正则表达式匹配的地方切开。
 * @since 2024/8/14 15:15:15
 */
public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, " +
                    "you must cut down the mightiest tree in the " +
                    "forest...with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+"); // W大写，表示匹配一个非单词字符。
        split("n\\W+");
    }
}
