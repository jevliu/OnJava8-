package v1ch06.interfaces;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 对一个Employee类实例数组进行排序的完整代码
 * @since 2024/9/29 20:45:15
 */
public class EmployeeSortTest {
    public static void main(String[] args) {

        Employee[] stuff = new Employee[3];

        stuff[0] = new Employee("Harry Potter", 30000.0);
        stuff[1] = new Employee("Hermione", 50000.0);
        stuff[2] = new Employee("Wesley", 20000.0);


        // The Employee class has accomplished the interface of Comparable
        Arrays.sort(stuff);

        for (Employee e : stuff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
