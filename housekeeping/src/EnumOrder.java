/**
 * @author 刘季伟
 * @implNote 展示创建一个枚举类型时会自动创建的toString() ordinal()等方法
 * @since 2024/4/19 13:39:24
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
