/**
 * @author 刘季伟
 * @implNote 展示匿名内部类如何进行字段的初始化操作
 * @since 2024/4/27 16:24:56
 */
public class Parcel9 {
    // 匿名内部类如果想使用在其外部定义的对象dest,则此参数引用必须是final的，即它在初始化后不会改变
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
