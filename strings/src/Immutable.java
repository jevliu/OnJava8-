/**
 * @author 刘季伟
 * @implNote 展示String 类对象的不可变性
 * @since 2024/7/19 10:01:49
 */
public class Immutable {
    public static String upCase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);

        String qq = upCase(q);
        System.out.println(qq);

        System.out.println(q);
    }
}
