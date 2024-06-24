/**
 * @author 刘季伟
 * @implNote 展示通过增加一个非可变参数的方式来解决重载中可能出现的冲突问题
 * @since 2024/4/19 13:30:15
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args){
        System.out.println("first");
    }
    static void f(char c, Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }

}
