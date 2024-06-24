/**
 * @author 刘季伟
 * @implNote 展示如何捕获构造函数的引用，然后通过引用调用该构造函数
 * @since 2024/6/23 12:16:37
 */
class Dog{
    String name;
    int age = -1; // For Unknown
    Dog(){
        name = "stray";
    }
    Dog(String nm){
        name = nm;
    }
    Dog(String nm, int yrs){name = nm; age = yrs;}
}
interface MakeNoArgs{
    Dog make();
}
interface Make1Arg{
    Dog make(String nm);
}
interface Make2Arg{
    Dog make(String nm, int age);
}
public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new;
        Make1Arg m1a = Dog::new;
        Make2Arg m2a = Dog::new;

        Dog dn = mna.make();
        Dog d1 = m1a.make("Comet");
        Dog d2 = m2a.make("Ralpg", 4);
    }
}
