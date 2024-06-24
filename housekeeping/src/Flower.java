/**
 * @author 刘季伟
 * @implNote 展示如何通过this 实现在构造器中调用构造器
 * @since 2024/4/16 14:43:04
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalcount = " + petalCount);
    }

    Flower(String ss){
        System.out.println("Constructor w/ string arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals){
        this(petals);
        // - this(s); // Can't call two!
        this.s = s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi", 47);
        System.out.println("no-arg constructor");
    }

    void printPetalCount(){
        // -this(11); // Not inside constructor!
        System.out.println("PetalCount = " + petalCount + ", s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }

}


