package v1ch05.abstractClass;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 11:25:28
 */
public class PersonTest {
    public static void main(String[] args) {

        Person[] array = new Person[3];
        array[0] = new Student("Tom", "Software Engineer");
        array[1] = new Employee("Jack", 50_000, 1998, 1, 26);
        array[2] = new Manager("Poney", 100_000, 1995, 4,21);

        for (Person p : array) {
            System.out.println(p.getDescription());
        }
    }
}
