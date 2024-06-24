import javax.swing.plaf.PanelUI;

/**
 * @author 刘季伟
 * @implNote 展示协变返回类型的使用示例
 * @since 2024/4/26 22:09:26
 */
class Grain{
    @Override
    public String toString(){
        return "Grain";
    }
}
class Wheat extends Grain{
    @Override
    public String toString(){
        return "Wheat";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}
class WheatMill extends Mill{
    @Override
    Wheat process(){
        return new Wheat();
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}
