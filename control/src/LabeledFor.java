/**
 * @author 刘季伟
 * @implNote 搭配标签的for 循环中使用break 和 continue
 * @since 2024/4/16 10:17:34
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer: // 此处不允许存在执行语句
        for(;;){ // 无限循环
            inner: // 此处不允许存在执行语句
            for(; i < 10; i++){
                System.out.println("i = " + i);
                if (i == 2){
                    System.out.println("continue");
                    continue;
                }
                if (i == 3){
                    System.out.println("break");
                    i++; // 否则i 永远无法获得自增
                    break;
                }
                if (i == 7){
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++){
                    if (k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
