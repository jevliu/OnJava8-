package v1ch05.inheritance;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/28 09:22:44
 */
public class ManagerTest {

    public static void main(String[] args) {
        // construct a manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1985, 12, 13);
        boss.setBonus(50000);

        Employee[] stuff = new Employee[3];

        // fill the stuff array with manager and employee objects
        stuff[0] = boss;
        stuff[1] = new Employee("Harry Hacker", 50000, 1990, 1,3);
        stuff[2] = new Employee("Tommy Testar", 30000, 1991, 5, 23);

        // print out information about all employee objects
        for (Employee e : stuff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }

}
