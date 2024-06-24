/**
 * @author 刘季伟
 * @implNote 展示实现接口的内部类在向上转型中的作用
 * @since 2024/4/27 15:52:44
 */
class Parcel4{
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value(){return i;}
    }
    protected final class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel(){return label;}
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tesmania");

    }
}
