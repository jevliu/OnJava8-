package polymorphism.shape;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/26 20:26:09
 */
public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }
}
