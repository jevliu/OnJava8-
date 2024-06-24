/**
 * @author 刘季伟
 * @implNote switch 语句使用示例：生成随机字母并判断它们是元音还是辅音字母
 * @since 2024/4/16 10:37:38
 */
import java.util.*;
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++){
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
                case 'y', 'w' -> System.out.println("sometimes vowel");
                default -> System.out.println("consonant");
            }
        }
    }
}
