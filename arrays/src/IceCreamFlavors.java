import java.util.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 展示Java是如何返回一个数组的
 * @since 2024/9/4 12:32:06
 */
public class IceCreamFlavors {
    private static SplittableRandom rand = new SplittableRandom(47);
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length)
            throw new IllegalArgumentException("Set too big");
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = rand.nextInt(FLAVORS.length);
            }
            while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return  results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            show(flavorSet(3));
        }
    }
}
