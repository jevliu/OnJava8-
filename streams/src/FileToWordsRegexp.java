import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.Pattern;
/**
 * @author 刘季伟
 * @implNote 我们再一次查看将文件转换为单词的过程。这一次，我们使用流将文件转换为一个
 * 字符串，接着使用正则表达式将字符串转化为单词流
 * @since 2024/7/17 16:25:56
 */
public class FileToWordsRegexp {
    private String all;
    public FileToWordsRegexp(String filePath) throws Exception {
        all = Files.lines(Paths.get(filePath))
                .skip(1)
                .collect(Collectors.joining(" "));
    }

    public Stream<String> stream(){
        return Pattern.compile("[ .,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws Exception{
        FileToWordsBuilder fw = new FileToWordsBuilder("Cheese.dat");
        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);

        fw.stream()
                .skip(7)
                .limit(2)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
