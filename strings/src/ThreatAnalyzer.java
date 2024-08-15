import java.util.regex.*;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示如何使用自定义的正则表达式来扫描一个防火墙日志文件中的威胁数据。
 * @since 2024/8/15 13:48:01
 */
public class ThreatAnalyzer {
    static String threatData = "58.27.82.161@08/10/2015\n" +
            "204.45.234.40@08/11/2015\n" +
            "58.27.82.161@08/12/2015\n" +
            "58.27.82.161@08/12/2015\n" +
            "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)){
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s%n", date, ip);
        }
    }
}
