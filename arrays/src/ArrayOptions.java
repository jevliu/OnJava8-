import java.util.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 展示初始化数组的多种方式
 * @since 2024/9/4 10:29:54
 */
public class ArrayOptions {
    public static void main(String[] args) {
        // 对象的数组
        BerylliumShpere[] a; // 未经初始化的本地变量
        BerylliumShpere[] b = new BerylliumShpere[5];

        // 数组中对象的引用会自动初始化为null
        show("b", b);
        BerylliumShpere[] c = new BerylliumShpere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) // 测试指向的对象是否为空
                c[i] = new BerylliumShpere();
        }

        // 聚合初始化，必须在定义处进行初始化
        BerylliumShpere[] d = {
                new BerylliumShpere(),
                new BerylliumShpere(),
                new BerylliumShpere()
        };

        // 动态聚合初始化，可以在任何地方创建和初始化数组对象
        a = new BerylliumShpere[] {
                new BerylliumShpere(),
                new BerylliumShpere(), // 尾部的逗号是可以省略的
        };

        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        a = d;
        System.out.println("a.length = " + a.length);

        // 基元数组
        int[] e; // 空引用
        int[] f = new int[5];

        // 数组中的基元会被自动初始化为0
        show("f", f);
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }
        int[] h = {11, 47, 93};

//        System.out.println("e.length = " + e.length); // 会产生编译错误，因为e没有被初始化
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);
        e = h;
        System.out.println("e.length = " + e.length);
    }
}
