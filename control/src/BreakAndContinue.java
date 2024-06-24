/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/16 09:59:43
 */
import static onjava.Range.*;
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            if (i == 74) break; // 跳出循环
            if(i % 9 != 0) continue; // 开始下一次循环
            System.out.print(i + " ");
        }
        System.out.println();

        // 使用for-in 循环：
        for (int i : range(100)){
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        // 无限循环
        while (true){
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
