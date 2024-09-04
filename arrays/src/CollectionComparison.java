import java.util.*;
import java.util.function.Supplier;

import onjava.*;
import onjava.ArrayShow.*;

import static onjava.ArrayShow.show;

/**
 * @author 刘季伟
 * @implNote 比较数组和泛型集合的示例
 * @since 2024/9/4 10:08:48
 */
class BerylliumShpere {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return "Sphere " + id;
    }
}
public class CollectionComparison {
    public static void main(String[] args) {
        BerylliumShpere[] spheres = new BerylliumShpere[10];
        for (int i = 0; i < 5; i++)
            spheres[i] = new BerylliumShpere();
        show(spheres);
        System.out.println(spheres[4]);

        List<BerylliumShpere> sphereList = Suppliers.create(
                ArrayList::new, BerylliumShpere::new, 5
        );
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

        int[] integers = {0, 1, 2, 3, 4, 5};
        show(integers);
        System.out.println(integers[4]);

        List<Integer> intList = new ArrayList<>(
                Arrays.asList(0, 1, 2, 3, 4, 5)
        );
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
