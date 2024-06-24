import java.sql.SQLOutput;

/**
 * @author 刘季伟
 * @implNote 展示创建一个内部类的简单示例
 * @since 2024/4/27 15:14:45
 */
public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){return label;}
    }
    // 在类内方法中使用内部类，就如同使用其他类一样
    public void ship(String dest){
        Contents s = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
