package v1ch06.interfaces;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 20:46:29
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {return name;}

    public Double getSalary(){return salary;}

    public void raiseSalary(Double byPercent) {
        Double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * @param other the object to be compared.
     * @return a negative value if this employee has a lower salary
     * than otherObject, 0 if the salaries are the same, a positive value otherwise.
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
