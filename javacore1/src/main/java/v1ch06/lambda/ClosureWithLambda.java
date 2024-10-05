package v1ch06.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/10/5 14:20:49
 */
public class ClosureWithLambda {
    public static void main(String[] args) {
        String suffix = "!";
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Lambda expression as closure to capture outside variable 'suffix'
        words.forEach(word -> System.out.println(word + suffix));

        // Use Lambda expression and closure to sort words
        words.sort((s1, s2) -> s1.length() - s2.length());
        words.forEach(System.out::println);

        // Deal with Lambda expression
        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
    }

    public static void repeat(int n, IntConsumer acction) {
        for (int i = 0; i < n; i++) acction.accept(i);
    }
}
