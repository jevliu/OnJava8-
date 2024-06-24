/**
 * @author 刘季伟
 * @implNote 展示当具有可选的尾数参数时，可变参数的个数可以是0这一特性的作用
 * @since 2024/4/19 13:14:54
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing){
        System.out.print("required: " + required + " ");
        for (String s : trailing){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
