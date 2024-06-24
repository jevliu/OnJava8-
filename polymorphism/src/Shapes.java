/**
 * @author 刘季伟
 * @implNote 展示多态的实际示例
 * @since 2024/4/26 20:35:45
 */
import polymorphism.shape.*;
public class Shapes {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        // 使用多态来调用方法
        for (Shape shape : gen.array(9)){
            shape.draw();
        }
    }
}
