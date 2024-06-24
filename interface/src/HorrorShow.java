/**
 * @author 刘季伟
 * @implNote 展示通过继承，可以在接口中增加方法声明，还可以在新接口中结合多个接口。这两种情况都可以得到新接口。
 * @since 2024/4/27 11:26:10
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void menace(){}
    @Override
    public void destroy(){}
}
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
class VeryBadVampir implements Vampire{
    @Override
    public void menace(){}
    @Override
    public void destroy(){}
    @Override
    public void kill(){}
    @Override
    public void drinkBlood(){}
}
public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }
    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampir();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
