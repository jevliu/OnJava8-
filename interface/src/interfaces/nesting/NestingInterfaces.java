package interfaces.nesting;

import javax.swing.plaf.PanelUI;

/**
 * @author 刘季伟
 * @implNote 展示接口是如何嵌套在类或其他接口中的
 * @since 2024/4/27 14:01:02
 */
class A{
    interface B{
        void f();
    }
    public class BImp implements B{
        @Override
        public void f(){}
    }
    public class BImp2 implements B{
        @Override
        public void f(){};
    }
    public interface C{
        void f();
    }
    class CImp implements C{
        @Override
        public void f(){};
    }
    private class CImp2 implements C{
        @Override
        public void f(){};
    }
    private interface D{
        void f();
    }
    private class DImp implements D{
        @Override
        public void f(){};
    }
    public class DImp2 implements D{
        @Override
        public void f(){};
    }
    public D getD(){
        return new DImp2();
    }
    private D dRef;
    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}
interface E{
    interface  G{
        void f();
    }
    interface H{
        void f();
    }
    void g();
}
public class NestingInterfaces {
    public class BImp implements A.B{
        @Override
        public void f(){}
    }
    class CImp implements A.C{
        @Override
        public void f(){}
    }
    class EImp implements E{
        @Override
        public void g(){}
    }
    class EGImp implements E.G{
        @Override
        public void f(){}
    }
    class EImp2 implements E{
        @Override
        public void g(){}
        class EG implements E.G{
            @Override
            public void f(){}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a2.receiveD(a.getD());
    }

}
