/**
 * @author 刘季伟
 * @implNote 展示如何使用Lambda 表达式和方法引用作为Runnable
 * @since 2024/6/23 11:54:34
 */
class Go{
    static void go(){
        System.out.println("Go::go()");
    }
}
public class RunnableMethodReference {
    public static void main(String[] args) {
        // Thread 对象将Runnable 作为其构造函数参数，并具有会调用run() 的方法start()。只有匿名内部类才需要具有名为run()的方法。
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(
                () -> System.out.println("lambda")
        ).start();

        new Thread(Go::go).start();
    }
}
