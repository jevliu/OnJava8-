/**
 * @author 刘季伟
 * @implNote 展示如何通过内部类提供的闭包功能来实现回调
 * @since 2024/4/27 18:46:19
 */
package innerclasses;

interface Incrementable{
    void increment();
}
// 一个只是简单实现Incrementable 接口的类
class Callee1 implements Incrementable{
    private int i = 0;
    @Override
    public void increment(){
        i++;
        System.out.println(i);
    }
}
class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}
// 如果想使类通过其他的方式来实现increment()方法，就必须使用内部类
class Callee2 extends MyIncrement{
    private int i = 0;
    @Override
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment(){
            // 显示地说明调用的是属于外部类中的方法，否则会得到无限的递归调用
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }
    void go(){callbackReference.increment();}
}
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
