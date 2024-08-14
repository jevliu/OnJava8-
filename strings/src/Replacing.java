/**
 * @author 刘季伟
 * @implNote String.split()的重载方法，用于限制字符串分割的次数。
 * @since 2024/8/14 15:26:49
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
