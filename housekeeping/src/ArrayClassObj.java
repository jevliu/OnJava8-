/**
 * @author 刘季伟
 * @implNote 展示非基本类型数组的创建
 * @since 2024/4/19 12:51:11
 */
import java.util.*;
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(500); // Autoboxing 完成后, 此时引用所指向的对象才被真正创建
        }
        System.out.println(Arrays.toString(a));
    }
}
