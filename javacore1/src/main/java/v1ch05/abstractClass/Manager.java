package v1ch05.abstractClass;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 11:20:30
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public String getDescription() {
        return "This manager's name is: " + super.getName();
    }

    public void setBonus(double number) {bonus = number;}

    public double getBonus() {return bonus;}

    public int hashCode() {
        return super.hashCode() + 17 * Double.hashCode(bonus);
    }

    public String toString() {
        return super.toString()
                + "[bonus=" +bonus
                + "]";

    }
}
