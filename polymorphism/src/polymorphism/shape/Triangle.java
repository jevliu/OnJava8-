package polymorphism.shape;

/**
 * @author 刘季伟
 * @implNote 继承自形状的三角形
 * @since 2024/4/26 20:28:43
 */
public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase()");
    }
}
