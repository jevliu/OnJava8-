import java.util.*;
/**
 * @author 刘季伟
 * @implNote 创建一个非泛型的数组并对其进行强制类型转换
 * @since 2024/9/4 14:11:45
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la; // 未检查的转型
        ls[0] = new ArrayList<>();
        Object[] objects = ls; // 这样的声明是可以的
        objects[1] = new ArrayList<>();
        List<BerylliumShpere>[] spheres = (List<BerylliumShpere>[])new List[10];
        Arrays.setAll(spheres, n -> new ArrayList<>());
    }
}
