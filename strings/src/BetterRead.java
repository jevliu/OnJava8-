import java.util.*;
/**
 * @author 刘季伟
 * @implNote 借助Scanner类实现更好的输入扫描工作。
 * @since 2024/8/15 13:21:58
 */
public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What's your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        int age = stdin.nextInt();
        double favoriate = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favoriate);
        System.out.format("Hi %s.%n", name);
        System.out.format("In 5 years you will be %d.%n", age + 5);
        System.out.format("My favorite double is %f.", favoriate / 2);
    }
}
