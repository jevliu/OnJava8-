/**
 * @author 刘季伟
 * @implNote 使用peek() 来无修改地查看流中的元素
 * @since 2024/7/18 15:50:07
 */
public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
