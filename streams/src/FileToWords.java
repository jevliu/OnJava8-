import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.Pattern;
/**
 * @author 刘季伟
 * @implNote 展示如何创建一个不需要中间储存层的单词流
 * @since 2024/7/18 15:54:03
 */
public class FileToWords {
    public static Stream<String> stream(String filePath) throws Exception {
        return Files.lines(Paths.get(filePath))
                .skip(1)
                .flatMap(line -> Pattern.compile("\\W+").splitAsStream(line));
    }
}
