/**
 * @author 刘季伟
 * @implNote 通过将类成员声明为private 的方式来控制类的访问可见性
 * @since 2024/4/19 15:18:13
 */

class Soup1{
    private Soup1(){}
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2{ // 单例模式，只允许创建类的一个对象
    private Soup2(){}

    private static Soup2 ps1 = new Soup2(); // 唯一的对象是作为static private 成员而创建的
    public static Soup2 access(){ // 访问该唯一对象的唯一public 接口
        return ps1;
    }
    public void f(){}
}

public class Lunch {
    void testPrivate(){
        // 因为构造器的私有属性，所以不能通过调用构造器的方法直接创建一个对象
        // Soup1 soup = new Soup1();
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }

    public static void main(String[] args) {
        Lunch l = new Lunch();
        l.testStatic();
        l.testSingleton();
    }

}
