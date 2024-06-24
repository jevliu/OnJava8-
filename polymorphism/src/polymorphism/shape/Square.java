package polymorphism.shape;

/**
 * @author 刘季伟
 * @implNote 继承自形状的圆
 * @since 2024/4/26 20:27:19
 */
public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
}
