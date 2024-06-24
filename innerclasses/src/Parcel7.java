/**
 * @author 刘季伟
 * @implNote 展示匿名内部类的使用示例
 * @since 2024/4/27 16:10:46
 */
public class Parcel7 {
    public Contents contents(){
        // 返回一个匿名内部类，返回值的生成与表示这个类的定义结合在一起！
        return new Contents() {
            // 使用默认构造器来构造类Contents
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        }; // 此处需要添加semicolon， 该分号是用来标记return 表达式的结束而不是此内部类的结束
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
