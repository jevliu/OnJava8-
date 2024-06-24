import javax.swing.plaf.PanelUI;

/**
 * @author 刘季伟
 * @implNote 展示具体如何选择使用继承还是组合
 * @since 2024/4/26 22:19:41
 */
class Actor{
    public void act(){}
}
class HappyActor extends Actor{
    @Override
    public void act(){
        System.out.println("HappyActor");
    }
}
class SadActor extends Actor{
    @Override
    public void act(){
        System.out.println("SadActor");
    }
}
class Stage{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
