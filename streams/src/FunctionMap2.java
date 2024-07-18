import java.util.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 将函数应用与流中的元素，但输入和输出的数据类型可以不同
 * @since 2024/7/18 16:29:31
 */
class Numbered {
    final int n;
    Numbered(int n){
        this.n = n;
    }
    @Override
    public String toString(){
        return "Numbered(" + n + ")";
    }
}

public class FunctionMap2 {
    public static void main(String[] args) {
        // 将获取的整数通过构造器Numbered::new 转化为Numbered类型
        Stream.of(1, 5, 7, 9, 11, 13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}
