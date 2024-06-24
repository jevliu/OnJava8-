/**
 * @author 刘季伟
 * @implNote 展示涉及到继承内部类时所使用的特殊语法
 * @since 2024/4/27 20:58:44
 */
class WithInner{
    class Inner{}
}
public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){
        // 注意这里构造器中的语法
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
