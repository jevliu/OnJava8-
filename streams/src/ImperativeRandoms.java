/**
 * @author 刘季伟
 * @implNote 与Randoms.java 进行对比，展示流式编程的语义清晰性。
 * @since 2024/6/24 15:06:58
 */
import java.util.*;
public class ImperativeRandoms {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> rints = new TreeSet<>();
        // 这种显示地编写迭代过程的方式称为外部迭代。
        while (rints.size() < 7){
            int r = rand.nextInt(20);
            if (r < 5) continue;
            rints.add(r);
        }
        System.out.println(rints);
    }
}
