/**
 * @author 刘季伟
 * @implNote 在Arrays.sort() 方法的参数中使用匿名内部类来创建一个自定义的Comparator
 * @since 2024/6/22 13:25:55
 */
import java.util.Arrays;
import java.util.Comparator;
public class AnonymousClassExample3 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 通过自定义的匿名内部类来实现降序排序
            }
        });

        System.out.println(Arrays.toString(fruits));
    }
}
