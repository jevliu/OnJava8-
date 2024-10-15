package v1ch08;

/**
 * @author 刘季伟
 * @implNote 演示一个简单泛型类的使用方法
 * @since 2024/10/6 14:45:54
 */
public class GenericExample1 {
    public static void main(String[] args) {
        // Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println("Integer value: " + integerBox.getValue());

        // String type
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println("String value: " + stringBox.getValue());
    }
}

// A generic Box class
class Box<T> {
    private T value;

    public void setValue(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}
