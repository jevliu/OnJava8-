package v1ch09;
import java.util.*;

/**
 * @author 刘季伟
 * @implNote 展示队列Queue的一些基本用法
 * @since 2024/10/17 19:22:51
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        // 查看队首的元素
        System.out.println("队首的元素：" + queue.peek());

        // 移除元素
        System.out.println("移除元素：" + queue.poll());
        System.out.println("队首元素：" + queue.peek());

        // 遍历队列
        System.out.println("当前队列的内容：");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
