/**
 * @author 刘季伟
 * @implNote 展示如何通过实例初始化的方式，来达到为一个匿名内部类创建一个构造器的效果
 * @since 2024/4/27 16:28:57
 */
abstract class Base{
    Base(int i){
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
