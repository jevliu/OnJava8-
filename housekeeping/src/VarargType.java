/**
 * @author 刘季伟
 * @implNote 展示了可变参数列表为数组的情形，如果数组中没有任何元素，那么将转变为大小为0的数组
 * @since 2024/4/19 13:22:45
 */
public class VarargType {
    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + int[].class);
    }

}
