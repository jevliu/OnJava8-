import java.util.regex.*;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 使用split()方法按照通用边界断开输入文本。
 * @since 2024/8/14 18:58:47
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)
        ));
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input, 3)
        ));
    }
}
