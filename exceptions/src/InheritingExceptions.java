import java.net.PortUnreachableException;

/**
 * @author 刘季伟
 * @implNote 可以通过继承已有的异常类的方式来定义自己的异常类。建立新的异常类最简单的方法就是让编译器为你产生无参构造器。
 * @since 2024/7/17 17:19:08
 */
class SimpleException extends Exception{}
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println(
                "Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e){
            System.err.println("Caught it!");
        }
    }

}
