package v1ch09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 刘季伟
 * @implNote 展示映射的基本用法，key为字符串，value为Employee对象
 * @since 2024/10/18 09:11:05
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-5527", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        // print all entries
        System.out.println(staff);

        // remove an entry
        staff.remove("567-24-2526");

        // replace an entry
        staff.put("456-62-5527", new Employee("Francesca Miller"));

        // iterate through all entries
        staff.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));

        // print the size of the map
        System.out.println(staff.size());
    }
}

class Employee {
    private String name;

    public Employee(String aName) {
        name = aName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return "This Employee's name is: " + this.name ;
//        return super.toString();
        return "name: " + this.name;
    }

}

