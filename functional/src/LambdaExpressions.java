/**
 * @author 刘季伟
 * @implNote 展示Lambda 表达式的示例用法
 * @since 2024/6/22 19:43:17
 */
interface Description{
    String brief();
}
interface Body{
    String detailed(String head);
}
interface Multi{
    String twoArg(String head, Double d);
}
public class LambdaExpressions {
    static Body bod = h -> h + " No Parens!"; // 只有一个参数的特例情况可以不适用（）
    static Body bod2 = (h) -> h + " More details"; // 正常情况使用括号（）包裹参数
    static Description desc = () -> "Short info"; // 如果没有参数，则必须使用括号（）表示空参数列表
    static Multi mult = (h, n) -> h + n; // 对于多个参数，将参数列表放在括号（）中
    static Description moreLines = () -> { // 如果表达式为多行，则必须将这些行放在花括号中并使用return
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
