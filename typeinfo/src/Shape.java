import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 向上转型的一个简单示例——形状与各种具体的形状。
 * @since 2024/8/15 14:13:12
 */
abstract class AbstractShape {
    void draw(){
        System.out.println(this + ".draw()");
    }
    @Override
    public abstract String toString();
}

class Circle extends AbstractShape {
    @Override
    public String toString(){return "Circle";}
}

class Square extends AbstractShape {
    @Override
    public String toString(){return "Square";}
}

public class Shape {
    public static void main(String[] args) {
        Stream.of(new Circle(), new Square()).forEach(AbstractShape::draw);
    }
}
