/**
 * @author 刘季伟
 * @implNote 展示可变参数列表与自动装箱的共同使用
 * @since 2024/4/19 13:27:17
 */
public class AutoboxingVarargs {
    public static void f(Integer... args){
        for (Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, 2);
        f(4, 5, 6, 7);
    }
}
