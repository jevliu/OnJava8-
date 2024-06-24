package onjava;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/16 09:48:49
 */
public class Range {
    // 根据步长生成序列
    public static int[] range(int start, int end, int step){
        if(step == 0)
            throw new
                    IllegalArgumentException("Step cannot be zero");
        int sz = Math.max(0, step >= 0?
                (end + step -1 - start) / step
                : (end + step + 1 - start) / step);
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start +(i * step);
        return  result;
    }
    // 生成一个序列[start, end)
    public static int[] range(int start, int end){
        return range(start, end, 1);
    }
    // 生成一个序列[0..n)
    public static int[] range(int n){
        return range(0, n);
    }
}
