import java.util.*;
/**
 * @author 刘季伟
 * @implNote 在Scanner中根据正则表达式来自定义自己所需的分隔符。
 * @since 2024/8/15 13:32:25
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}
