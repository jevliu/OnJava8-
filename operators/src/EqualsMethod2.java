/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/16 08:06:01
 */
class Value{
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();

        v1.i = v2.i = 100;

        System.out.println(v1.equals(v2));
    }
}
