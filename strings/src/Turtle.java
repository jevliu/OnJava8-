import java.io.*;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示Formatter类的使用方法
 * @since 2024/8/12 10:04:19
 */

public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f){
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y){
        f.format("%s The Turtle is at (%d,%d)%n", name, x, y);
    }

    public static void main(String[] args){
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));

        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        tommy.move(2, 5);
    }
}
