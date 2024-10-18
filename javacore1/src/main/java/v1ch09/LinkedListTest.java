package v1ch09;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示基于链表的一些操作用法
 * @since 2024/10/17 14:33:31
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // 合并两个链表，将b合并到a中
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        // 从第二个链表中每间隔一个元素删除一个元素
        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next(); // 跳过一个元素
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        // 删除a中所有来自b中的元素
        a.removeAll(b);
        System.out.println(a);

    }
}
