import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示类初始化的步骤
 * @since 2024/8/15 15:46:57
 */
class Initable {
    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 = ClassInitialization.rand.nextInt(1000); // 不是一个编译期常量
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable22 {
    static int staticNonFinal = 147; // 非final的字段，需要在被读取前进行链接（分配内存空间）和初始化（初始化该内存空间）
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable33 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class; // 类字面常量，此时不会引发初始化
        System.out.println("After creating Initable ref");
        // 下面这条语句并不会触发类的初始化，因为访问的是一个编译期常量
        System.out.println(Initable.STATIC_FINAL);
        // 这条语句会触发类的初始化
        System.out.println(Initable.STATIC_FINAL2);
        // 会触发类的初始化
        System.out.println(Initable22.staticNonFinal);
        try {
            Class initable3 = Class.forName("Initable33");
        } catch (ClassNotFoundException e) {
            System.out.println("Initable33 not found.");
            System.exit(1);
        }
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable33.staticNonFinal);


    }
}
