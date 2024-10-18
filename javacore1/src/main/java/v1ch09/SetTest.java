package v1ch09;
import java.util.*;
import java.io.File;
/**
 * @author 刘季伟
 * @implNote 展示如何使用集合输出从文件输入字符中所有独一五二的字符
 * @since 2024/10/17 16:41:56
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        try (Scanner in = new Scanner(new File("alice30.txt"))){
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        Iterator<String> iterator = words.iterator();
        for (int i = 0; i <= 20 && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
        System.out.println("...");
        System.out.println(words.size() + " distinct words." + totalTime + " milliseconds.");

        // 查看当前的工作目录
        System.out.println(System.getProperty("user.dir"));

    }
}
