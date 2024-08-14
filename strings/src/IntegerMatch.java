/**
 * @author 刘季伟
 * @implNote 检查一个String是否符合给定的正则表达式。
 * @since 2024/8/14 15:06:16
 */
public class IntegerMatch {
    public static void main(String[] args){
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
