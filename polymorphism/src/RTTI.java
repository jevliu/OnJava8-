/**
 * @author 刘季伟
 * @implNote 展示了运行时检查类型的行为即运行时类型信息，确保向下转型的正确
 * @since 2024/4/27 08:32:09
 */
class Useful{
    public void f(){}
    public void g(){}
}
class MoreUseful extends Useful{
    @Override
    public void f(){}
    @Override
    public void g(){}
    public void u(){}
    public void v(){}
    public void w(){}
}
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        ((MoreUseful)x[1]).u(); // 向下转型，RTTI
        ((MoreUseful)x[0]).u(); // 向下转型失败，抛出运行时异常
    }
}
