package v1ch05.abstractClass;
import java.time.*;
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
}
