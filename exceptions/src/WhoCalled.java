/**
 * @author 刘季伟
 * @implNote 展示栈轨迹的调用顺序, 元素 0 是栈顶元素，并且是调用序列中的最后一个方法调用（这个 Throwable 被
 * 创建和抛出之处）。数组中的最后一个元素和栈底是调用序列中的第一个方法调用。
 * @since 2024/7/18 11:58:13
 */
public class WhoCalled {
    static void f(){
        // 产生一个异常来填充栈轨迹
        try{
            throw new Exception();
        }catch (Exception e){
            for (StackTraceElement ste : e.getStackTrace()){
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g(){f();}
    static void h(){g();}

    public static void main(String[] args) {
        f();
        System.out.println("************");
        g();
        System.out.println("************");
        h();
    }


}
