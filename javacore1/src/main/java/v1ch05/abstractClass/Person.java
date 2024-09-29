package v1ch05.abstractClass;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 11:04:04
 */
public abstract class Person {
    private String name;

    public Person(String s) {
        name = s;
    }

    public abstract String getDescription();

    public String getName() {return name;}
}
