package v1ch10.draw;
import java.awt.*;
/**
 * @author 刘季伟
 * @implNote 输出本机上所有的字体
 * @since 2024/10/18 21:44:55
 */
public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String name : fontNames) {
            System.out.println(name);
        }
    }
}
