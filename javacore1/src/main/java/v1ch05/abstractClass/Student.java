package v1ch05.abstractClass;

import javax.xml.namespace.QName;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 11:05:58
 */
public class Student extends Person{
    private String college;

    public Student(String name, String college) {
        super(name);
        this.college = college;
    }

    public String getDescription() {
        return "This student's college is: " + college + "and name is: " +
                super.getName();
    }
}
