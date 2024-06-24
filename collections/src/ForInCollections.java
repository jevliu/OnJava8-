/**
 * @author 刘季伟
 * @implNote 在Collection 对象中使用for-in 语法
 * @since 2024/6/22 12:43:34
 */
import java.util.*;
public class ForInCollections {
    public static void main(String[] args){
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs)
            System.out.print("'" + s + "' ");
    }
}
