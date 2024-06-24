/**
 * @author 刘季伟
 * @implNote 使用onjava 包中的Stack 类进行简单操作
 * @since 2024/5/24 10:44:56
 */
import onjava.Stack;


public class StackTest2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
