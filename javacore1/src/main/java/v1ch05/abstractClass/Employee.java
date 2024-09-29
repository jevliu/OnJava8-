package v1ch05.abstractClass;
import java.time.*;
import java.util.Objects;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 11:11:54
 */
public class Employee extends Person {
    private double salary;
    private LocalDate onboardTime;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        onboardTime = LocalDate.of(year, month, day);
        this.salary = salary;
    }

    public String getDescription(){
        return "The Employee' s name is: " + super.getName() +
                "and his salary now is: " + salary;
    }

    public void salaryChanged(double percent) {
        double value = salary * percent / 100;
        salary += value;
    }

    public LocalDate getOnboardTime() {return onboardTime;}

    public double getSalary() {return salary;}


    private boolean equalAnother(Object otherObject) {
        // test if the other object refer to the same one
        if (this == otherObject){return true;}


        // test the other object is null or not
        if (otherObject == null) {return false;}

        //test if the two object belongs to the same class
        if (this.getClass() != otherObject.getClass()){return false;}

        // now we can sure that the two items belong to the same class
        Employee other = (Employee) otherObject;
        return
                this.getName().equals(other.getName()) &&
                        this.salary == other.salary &&
                        this.onboardTime.equals(other.onboardTime);
    }

    public int hashCode() {
        return Objects.hash(name, salary, onboardTime);
    }

    public String toString() {
        return getClass().getName() +
                "[name=" + name +
                ",salary=" + salary +
                ",hireday=" + onboardTime +
                "]";

    }


}
