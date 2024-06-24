/**
 * @author 刘季伟
 * @implNote 一个产生随机浮点数的例子，展示当一个类没有实现Readable接口时，如何让Scanner作用于它。
 * @since 2024/4/27 13:42:21
 */
import java.util.*;
public interface RandomDoubles {
    Random RAND = new Random(47);
    default double next(){
        return RAND.nextDouble();
    }
    static void main(String[] args){
        RandomDoubles rd = new RandomDoubles() {}; // 匿名内部类？
        for (int i = 0; i < 7; i++){
            System.out.println(rd.next() + " ");
        }
    }
}
