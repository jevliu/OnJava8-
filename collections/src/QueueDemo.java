/**
 * @author 刘季伟
 * @implNote 展示了在Queue 接口中与Queue 相关的方法，LinkedList 实现了Queue 接口，并且提供了一些方法以支持队列行为；因此LinkedList 可以
 * 用作Queue 的一种实现。
 * @since 2024/5/24 11:51:43
 */
import java.util.*;
public class QueueDemo {
    public static void printQ(Queue queue){
    while (queue.peek() != null)
        System.out.print(queue.remove() + " ");
    System.out.println();
    }

    public static void main(String[] args) {
        // 接口窄化了对LinkedList 方法的访问权限
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            // offer() 在队列尾部插入一个元素，或者返回false
            queue.offer(rand.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}

