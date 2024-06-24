/**
 * @author 刘季伟
 * @implNote 展示为了创建可初始化的类就必须继承抽象类，并提供所有抽象方法的定义
 * @since 2024/4/27 08:56:54
 */
abstract class Uninstantiable{
    abstract void f();
    abstract int g();
}
public class Instantiable extends Uninstantiable{
    @Override
    void f(){
        System.out.println("f()");
    }
    @Override
    int g(){
        return 22;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
    }
}
