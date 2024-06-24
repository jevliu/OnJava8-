/**
 * @author 刘季伟
 * @implNote 展示接口适配功能所带来的灵活性
 * @since 2024/4/27 11:39:14
 */
import java.nio.*;
import java.util.*;

public class RandomStrings implements Readable {
    private static Random random = new Random(47);
    private static final char[] CAPITALS = "ABCDEFG".toCharArray();
    private static final char[] LOWERS = "abcdefg".toCharArray();
    private static final char[] VOWELS = "aeiou".toCharArray();
    private int count;
    public RandomStrings(int count){
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb){
        if(count-- == 0){
            return -1; // 指示到达输入的末尾
        }
        cb.append(CAPITALS[random.nextInt(CAPITALS.length)]);
        for (int i = 0; i < 4; i++){
            cb.append(LOWERS[random.nextInt(LOWERS.length)]);
            cb.append(VOWELS[random.nextInt(VOWELS.length)]);
        }
        cb.append(" ");
        return 10; // number of characters appended
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomStrings(10));
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }
}
