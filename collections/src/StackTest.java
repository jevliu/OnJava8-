/**
 * @author 刘季伟
 * @implNote 展示ArrayDeque 实现堆栈功能的用法示例
 * @since 2024/5/24 10:35:58
 */
import java.util.*;
public class StackTest {
    public static void main(String[] args){
        Deque<String> stack = new ArrayDeque<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
