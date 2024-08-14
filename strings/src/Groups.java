import java.util.regex.*;
/**
 * @author 刘季伟
 * @implNote 展示正则表达式组的例子。
 * @since 2024/8/14 16:56:26
 */
public class Groups {
    public static final String POEM =
            """
                    Twas brillig, and the slithy toves
                    Did gyre and gimble in the wabe.
                    All mimsy were raths outgrabe.
                    And the mome raths outgrabe.
                    
                    Beware the Jabberwock, my son,
                    The jaws that bite, the claws that catch.
                    Beware the Jubjub bird, and shun
                    The frumious Bandersnatch.
                    """;

    public static void main(String[] args) {
        Matcher m = Pattern.compile(
                "(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$"
        ).matcher(POEM);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++) {
                System.out.print("[" + m.group(j) + "]");
            }
            System.out.println();
        }
    }
}
