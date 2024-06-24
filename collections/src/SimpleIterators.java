import java.util.*;

/**
 * @author 刘季伟
 * @implNote 展示了迭代器的适用示例
 * @since 2024/5/23 12:33:51
 */
public class SimpleIterators {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        Iterator<String> it = list1.iterator();
        // 使用Iterator遍历集合
        while (it.hasNext()){
            String fruit = it.next();
            System.out.println(fruit);
        }
        // 遍历集合并删除指定的元素
        while (it.hasNext()){
            String fruit = it.next();
            if (fruit.equals("banna")){
                it.remove();
            }
        }
        System.out.println(list1);
        // 使用Iterator遍历并过滤元素
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
        // 使用Iterator 在遍历过程中修改元素（非结构性修改）
        Iterator<Integer> ite = list2.iterator();
        while (ite.hasNext()){
            int num = iterator.next();
            if(num % 2 == 0){
                list2.set(list2.indexOf(num), 99);
            }
        }
        System.out.println(list2);
    }
}
