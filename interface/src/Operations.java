/**
 * @author 刘季伟
 * @implNote 展示在接口中添加静态方法的作用，这是模板方法设计模式的一个版本，runOps() 是一个模板方法。
 * @since 2024/4/27 09:58:54
 */
import java.util.*;

public interface Operations {
    void execute();
    // 加入静态方法作为操作接口的工具
    static void runOps(Operations... ops){ // 使用可变参数列表，可以传入任意数量的Operations 并按顺序运行它们
        for (Operations op : ops){
            op.execute();
        }
    }
    // 加入静态方法作为通用的工具
    static void show(String msg){
        System.out.println(msg);
    }
}
