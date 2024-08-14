import java.util.regex.*;
/**
 * @author 刘季伟
 * @implNote 正则表达式中标记参数的使用。
 * @since 2024/8/14 18:53:34
 */
public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE |
                Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                        "JAVA has pretty good regular expressions\n" +
                        "Regular expressions are in java"
        );
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
