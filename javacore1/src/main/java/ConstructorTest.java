import java.util.Random;
import static java.lang.Math.*;
/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/27 19:51:59
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // fill the stuff array with three Employee objects
        Employee[] stuff = new Employee[3];

        stuff[0] = new Employee("Harry", 40000);
        stuff[1] = new Employee(60000);
        stuff[2] = new Employee();

        // print out information about all Employee objects
        for (Employee e : stuff) {
            System.out.println("name = " +e.getName() +",id = " + e.getId() + ",salary = " + e.getSalary());
        }

        // with static import
        double n = pow(2, 2);
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block
    static
    {
        Random generator = new Random();
        // set nextId to a random number between 0 and 999
        nextId = generator.nextInt(1000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee (String n, double s){
        this.name = n;
        this.salary = s;
    }

    public Employee(double s) {
        this("Employee #" +nextId, s);
    }

    // the default constructor
    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
