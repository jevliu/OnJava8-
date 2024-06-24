package polymorphism.shape;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote RandomShapes 是一种工厂，每当我们调用get() 方法时就会产生一个指向随机创建的Shape 对象的引用。
 * @since 2024/4/26 20:30:15
 */
public class RandomShapes {
    private Random rand = new Random(47);
    public Shape get(){
        switch (rand.nextInt(3)){
            default:
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Triangle();
        }
    }
    public Shape[] array(int sz){
        Shape[] shapes = new Shape[sz];
        for (int i = 0; i < shapes.length; i++){
            shapes[i] = get();
        }
        return shapes;
    }
}
