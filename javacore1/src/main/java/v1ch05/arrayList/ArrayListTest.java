package v1ch05.arrayList;

import v1ch05.abstractClass.Employee;

import java.util.*;

/**
 * @author 刘季伟
 * @implNote 泛型数组列表
 * @since 2024/9/29 19:03:21
 */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();
        staff.ensureCapacity(100);
        staff.add(new Employee("Harry", 10_000, 2001,5, 18));
        System.out.println(staff.size());

//        ArrayList<Employee> newStaff = staff;
//        System.out.println(Objects.equals(newStaff, staff));

        Employee eric = new Employee("Eric", 10_0000, 1998, 1,1);
        staff.set(0, eric);
        for (Employee e : staff) {
            System.out.println(e);
        }

        eric = staff.get(0);
        System.out.println(eric);

        System.out.printf("%d %s", 1, "widgets");
    }
}
