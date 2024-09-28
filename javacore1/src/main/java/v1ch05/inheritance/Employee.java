package v1ch05.inheritance;
import java.time.*;

/**
 * @author 刘季伟
 * @implNote java核心技术卷1第10版第5章之继承
 * @since 2024/9/28 09:03:03
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){return name;}

    public double getSalary(){return salary;}

    public LocalDate getHireDay() {return hireDay;}

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
