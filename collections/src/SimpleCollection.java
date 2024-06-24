/**
 * @author 刘季伟
 * @implNote 展示Collection接口——概括了序列的概念，一种存放一组对象的方式
 * @since 2024/4/28 11:10:39
 */
import java.util.*;
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            c.add(i);
        }
        for (Integer i : c){
            System.out.print(i + ", ");
        }
    }
}
