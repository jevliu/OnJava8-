/**
 * @author 刘季伟
 * @implNote 实现含有抽象方法的接口的展示示例
 * @since 2024/4/27 09:25:09
 */
public class Implementation2 implements InterfaceWithDefault{
    @Override
    public void firstMethod(){
        System.out.println("firstMethod");
    }
    @Override
    public void secondMethod(){
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new Implementation2();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}
