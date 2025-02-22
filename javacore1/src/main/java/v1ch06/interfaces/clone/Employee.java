package v1ch06.interfaces.clone;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/30 11:40:11
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Employee implements Cloneable{
    private String name;
    private Double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        // call Object clone
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    /**
     * Set the hire day to a given day
     * @param year the year of the hire day
     * @param month the month of the hire day
     * @param day the day of the hire day
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        // Example of instance field mutation
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return  "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
