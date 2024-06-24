/**
 * @author 刘季伟
 * @implNote 展示如何在任意作用域内嵌入一个内部类
 * @since 2024/4/27 16:06:42
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if (b){
            // 只能在当前花括号的范围内使用类TrackingSlip
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){id = s;}
                String getSlip(){return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }
    public void track(){internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
