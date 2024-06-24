/**
 * @author 刘季伟
 * @implNote 展示为了实现两个具有同样方法签名的接口，则需要重写冲突的方法
 * @since 2024/4/27 09:53:59
 */
import java.util.*;

interface Jim1{
    default void jim(){
        System.out.println("Jim1::jim()");
    }
}
interface Jim2{
    default void jim(){
        System.out.println("Jim2::jim()");
    }
}
public class Jim implements Jim1, Jim2 {
    @Override
    public void jim(){
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
