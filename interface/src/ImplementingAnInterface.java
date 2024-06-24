/**
 * @author 刘季伟
 * @implNote 展示如何在类中实现一个接口
 * @since 2024/4/27 09:16:54
 */
interface Concept{
    void idea1(); // 如果不声明访问权限修饰符，默认也是public
    void idea2();
}
class Implementation implements Concept{
    @Override
    public void idea1(){
        System.out.println("idea1");
    }
    @Override
    public void idea2(){
        System.out.println("idea2");
    }

}
public class ImplementingAnInterface {
}
