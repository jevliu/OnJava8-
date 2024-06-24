/**
 * @author 刘季伟
 * @implNote 展示如何使用Iterable 来显示所有的操作系统环境变量
 * @since 2024/6/22 13:39:19
 */
import java.util.*;
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }
}
