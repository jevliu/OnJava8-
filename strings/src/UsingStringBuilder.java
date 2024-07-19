import java.util.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 展示StringBuilder的适用性
 * @since 2024/7/19 11:38:06
 */
public class UsingStringBuilder {
    public static String string1(){
        Random rand =  new Random(47);
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < 25; i++){
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");

        return result.toString();
    }

    public static String string2(){
        String result = new Random(47)
                .ints(25, 0, 100)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        return "[" + result + "]";
    }

    public static void main(String[] args) {
        System.out.println(string1());
        System.out.println(string2());
    }
}
