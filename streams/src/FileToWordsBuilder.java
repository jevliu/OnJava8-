import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.*;
import java.io.*;
import java.nio.*;
/**
 * @author 刘季伟
 * @implNote 展示流的创作者模式，在建造者模式（Builder design pattern）中，首先创建一个 builder 对象，然后将
 * 创建流所需的多个信息传递给它，最后 builder 对象执行” 创建 “流的操作。Stream库提供了这样的 Builder。在这里，
 * 我们重新审视文件读取并将其转换成为单词流的过程。
 * @since 2024/7/17 16:01:06
 */
public class FileToWordsBuilder {
    // 创建一个builder对象
    Stream.Builder<String> builder = Stream.builder();

    // 将创建流所需的多个信息传递给它
    public FileToWordsBuilder(String filePath) throws Exception{
        Files.lines(Paths.get(filePath))
                .skip(1) // 略过开头的注释行
                .forEach(line -> {
                    for(String w : line.split("[ .?,]+"))
                        builder.add(w);
                });
    }

    // 执行创建流的操作
    Stream<String> stream(){
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        new FileToWordsBuilder("Cheese.dat")
                .stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }

}
