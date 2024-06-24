import javax.crypto.spec.PSource;

/**
 * @author 刘季伟
 * @implNote 使用外部类的名字后面紧跟原点和this的方式来生成对外部类对象的引用
 * @since 2024/4/27 15:42:12
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
            // 如果仅仅写this将是指向内部类对象的this
        }
    }
    public Inner inner(){return new Inner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
