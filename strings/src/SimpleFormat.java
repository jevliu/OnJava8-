/**
 * @author 刘季伟
 * @implNote 一个简单的使用格式化输出的示例
 * @since 2024/7/19 12:13:44
 */
public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        // 老方法
        System.out.println("Row 1: [" + x + " " + y + "]");
        // 新方法
        System.out.format("Row 1: [%d %f]%n", x, y);
        // 或者使用printf
        System.out.printf("Row 1: [%d %f]%n", x, y);
    }
}
