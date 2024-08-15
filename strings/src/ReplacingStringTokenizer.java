import java.util.*;
/**
 * @author 刘季伟
 * @implNote 正则表达式、Scanner类、StringTokenizer三者相互比较。
 * @since 2024/8/15 14:02:10
 */
public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while (stoke.hasMoreElements())
            System.out.print(stoke.nextToken() + " ");
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")));

        // 使用Scanner
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())
            System.out.print(scanner.next() + " ");
    }
}
