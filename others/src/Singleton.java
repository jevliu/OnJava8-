/**
 * @author 刘季伟
 * @implNote 通过双重检查加锁（DCL）来实现单例模式。
 * @since 2024/6/24 22:06:35
 */
public class Singleton {
    // 适用volatile 关键字确保可见性
    private static volatile Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton(){}

    // 提供全局访问点
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
