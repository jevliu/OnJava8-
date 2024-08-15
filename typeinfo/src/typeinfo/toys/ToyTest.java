package typeinfo.toys;
/**
 * @author 刘季伟
 * @implNote 测试Class类
 * @since 2024/8/15 14:59:40
 */
interface HasBetteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // 下面的无参数构造器会引起NoSuchMethodError错误
    Toy(){} // 为了使用newInstance()来创建类所用
    Toy(int i){}
}
class FancyToy extends Toy implements HasBetteries, Waterproof, Shoots {
    FancyToy(){super(1);}
}
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" +
                cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null; // 创建一个Class引用
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }

        printInfo(c);
        System.out.println();

        for (Class face : c.getInterfaces())
            printInfo(face);
        System.out.println();

        Class up = c.getSuperclass(); // 得到父类Toy,up得到一个对象的引用，但是不知道这个引用具体会指向哪个类的Class对象。
        Object obj = null;

        try {
            // 需要无参构造器
            obj = up.newInstance(); // "虚拟构造器“， 可以在不知道一个类的确切类型时创建这个类的对象。
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }
}
