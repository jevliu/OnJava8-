/**
 * @author 刘季伟
 * @implNote 展示一个由多个接口结合而成的具体类产生的新类
 * @since 2024/4/27 11:16:39
 */
interface CanFight{
    void fight();
}
interface CanFly{
    void fly();
}
interface CanSwim{
    void swim();
}
class ActionCharacter{
    public void fight(){};
}
class Hero extends ActionCharacter implements CanFly, CanFight, CanSwim {
    public void swim(){}
    public void fly(){}
}
public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
