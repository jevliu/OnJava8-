package v1ch09;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 使用Map来统计给定文本中已阅单词出现的频率，实现以下功能：
 * -- 接受一个字符串作为输入，并返回每个单词出现的次数
 * -- 允许用户查询特定单词的频率
 * @since 2024/10/18 10:47:00
 */
public class WordFrequency {
    private Map<String, Integer> wordCount = new HashMap<>();

    // 统计单词的频率
    public void countWords(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    // 查询特定单词的频率
    public int getWordFrequency(String word) {
        return wordCount.getOrDefault(word.toLowerCase(), 0);
    }

    public static void main(String[] args) {
        WordFrequency wf = new WordFrequency();
        wf.countWords("Hello world, hello everyone. This world is beautiful");

        System.out.println("频率统计：" + wf.wordCount);
        System.out.println("Hello出现的频率：" + wf.getWordFrequency("Hello"));
    }
}
