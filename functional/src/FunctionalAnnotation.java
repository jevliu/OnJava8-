/**
 * @author 刘季伟
 * @implNote 展示函数式方法的基本用法
 * @since 2024/6/23 12:41:31
 */
@FunctionalInterface
interface Functional{
    String goodbye(String msg);// 只允许有一个抽象方法
}
interface FunctionalNoAnn{
    String goodbye(String msg);
}
public class FunctionalAnnotation {
    public String goodbye(String arg){
        return "Goodbye" + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
        Functional f1 = a -> "Goodbye, " + a;
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
    }
}
