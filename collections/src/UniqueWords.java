/**
 * @author 刘季伟
 * @implNote 使用TreeSet 来读取一个文件中所有出现过的单词
 * @since 2024/5/24 11:17:13
 */
import java.util.*;
import java.nio.file.*;

public class UniqueWords {
    public static void main(String[] args) throws Exception{
        List<String> lines = Files.readAllLines(Paths.get("Stack.java"));
        Set<String> words= new TreeSet<>();
        for (String line : lines)
            for (String word : line.split("\\W+"))
                if (word.trim().length() > 0)
                    words.add(word);

        System.out.println(words);
    }
}
