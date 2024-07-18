/**
 * @author 刘季伟
 * @implNote 为异常类创建一个接受字符串参数的构造器
 * @since 2024/7/17 17:35:50
 */
class MyException extends Exception{
    MyException(){}
    MyException(String msg){super(msg);}
}
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
