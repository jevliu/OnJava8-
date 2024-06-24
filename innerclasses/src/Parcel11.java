/**
 * @author 刘季伟
 * @implNote 展示嵌套类的使用示例
 * @since 2024/4/27 16:35:56
 */
public class Parcel11 {
    private static class ParcelContents implements Contents{
        private int i = 11;
        @Override
        public int value(){return i;}
    }
    protected static final class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel(){return label;}
        // 声明为static的内部类可以包含其他static的元素
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }
    }
    public static Destination destination(String s){return new ParcelDestination(s);}
    public static Contents contents(){return new ParcelContents();}

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
