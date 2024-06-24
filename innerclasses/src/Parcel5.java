/**
 * @author 刘季伟
 * @implNote 展示定义在方法内部——局部内部类的用法
 * @since 2024/4/27 16:01:12
 */
public class Parcel5 {
    public Destination destination(String s){
        // 只有在方法内部才能访问这个内部类，方法一旦执行完毕，该内部类就不可用了。
        final class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){label = whereTo;}
            @Override
            public String readLabel(){return label;}
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
