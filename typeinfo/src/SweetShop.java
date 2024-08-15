/**
 * @author 刘季伟
 * @implNote 展示类加载器是如何应用Class对象来创建这个类的所有对象的。
 * @since 2024/8/15 14:44:55
 */
class Cookie {
    // 静态初始代码块在类第一次被加载时就会被初始化执行
    static {
        System.out.println("Loading Cookie");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            // 根据目标类的类名得到该类的Class对象，本例中只是为了验证类是否被加载所以没有返回值
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
