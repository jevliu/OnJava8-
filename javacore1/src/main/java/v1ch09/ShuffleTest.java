package v1ch09;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 使用shuffle来随机打乱数组
 * @since 2024/10/18 15:22:47
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        // 从打乱后的列表中选取前6个值
        List<Integer> winningCombination = numbers.subList(0, 6);

        // 再将选择的值进行重新排序
        Collections.sort(winningCombination);
        System.out.println(winningCombination);

    }
}
