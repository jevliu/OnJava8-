/**
 * @author 刘季伟
 * @implNote 展示未绑定的方法引用，即指没有关联对象的普通（非静态）方法。使用未绑定的引用时，必须先提供对象
 * @since 2024/6/23 12:09:31
 */
class X{
    String f(){return "X::f()";}
}
interface MakeString{
    String make();
}
interface TransformX{
    String transform(X x);
}
public class UnboundMethodReference {
    public static void main(String[] args) {
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
    }
}
