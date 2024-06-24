/**
 * @author 刘季伟
 * @implNote 使用映射Map 来检查随机类Random 生成的随机数的统计次数
 * @since 2024/5/24 11:42:26
 */

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++){
            // 生成一个在0~20之间的值
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
