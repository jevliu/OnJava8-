package v1ch09;
import java.util.*;
import java.time.*;
/**
 * @author 刘季伟
 * @implNote 展示优先级队列的一些基本用法
 * @since 2024/10/17 19:56:19
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1910, 6, 22));

        System.out.println("Iterating over elements: ");
        for (LocalDate date : pq) {
            System.out.println(date);
        }

        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
