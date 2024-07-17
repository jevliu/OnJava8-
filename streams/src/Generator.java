import java.util.*;
import java.util.function.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 参照RandomWords.java 中 Stream.generate() 搭配 Supplier<T> 使用的例子。
 * @since 2024/7/17 15:21:02
 */
public class Generator implements Supplier<String>{
    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public String get(){
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String word = Stream.generate(new Generator()).limit(30).collect(Collectors.joining());
        System.out.println(word);
    }

}
