/**
 * @author 刘季伟
 * @implNote 展示如何保证适当的清理
 * @since 2024/4/26 17:58:02
 */

package reuse;

class Shape{
    Shape(int i){
        System.out.println("Shape constructor");
    }
    void dispose(){
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Drawing Circle");
    }
    @Override
    void dispose(){
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        System.out.println("Drawing Triangle");
    }
    @Override
    void dispose(){
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + ", " + end);
    }
    @Override
    void dispose(){
        System.out.println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i){
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }
    @Override
    public void dispose(){
        System.out.println("CADSystem.dispose()");
        // 同C++相似，清理的顺序与构造的顺序相反
        t.dispose();
        c.dispose();
        for (int j = 0; j < lines.length; j++){
            lines[j].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            //
        }finally {
            x.dispose();
        }
    }
}
