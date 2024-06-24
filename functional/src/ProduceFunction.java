/**
 * @author 刘季伟
 * @implNote 高阶函数：消费或产生函数的函数
 * @since 2024/6/23 12:51:14
 */
import java.sql.SQLOutput;
import java.util.function.*;

interface FuncSS extends Function<String, String>{} // 使用继承为专用接口创建别名
public class ProduceFunction {
    // produce()是高阶函数，使用lambda表达式再方法中创建和返回一个函数
    static FuncSS prodece(){
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS f = prodece();
        System.out.println(f.apply("YELLING"));
    }
}
