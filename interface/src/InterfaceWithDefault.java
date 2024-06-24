/**
 * @author 刘季伟
 * @implNote 在接口中加入默认方法，确保当实现接口的类没有重新实现该方法时可以提供默认实现
 * @since 2024/4/27 09:22:59
 */
public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();
    default void newMethod(){
        System.out.println("newMethod()");
    }
}
