/**
 * @author 刘季伟
 * @implNote 使用switch 语句来检查Math.random() 产生随机数的范围
 * @since 2024/4/16 12:07:27
 */
import onjava.*;
public class RandomBounds {
    public static void main(String[] args) {
        new TimedAbort(3); // 使得程序在3秒后中止
        switch (args.length == 0 ? "" : args[0]){
            case "lower":
                while (Math.random() != 0.0){
                    ; // 保持重试
                }
                System.out.println("Produced 0.0!");
                break;
            case "upper":
                while (Math.random() != 1.0)
                    ;
                System.out.println("Produced 1.0!");
                break;
            default:
                System.out.println("Usage:");
                System.out.println("\tRandomBounds lower");
                System.out.println("\tRandomBounds upper");
                System.exit(1);
        }
    }
}
