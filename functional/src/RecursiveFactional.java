/**
 * @author 刘季伟
 * @implNote 使用递归来实现整数的阶乘
 * @since 2024/6/22 20:08:29
 */
public class RecursiveFactional {
    static IntCall fact;
    public static void main(String[] args){
        fact = n -> n == 0 ? 1 : n * fact.call(n -1);
        for (int i = 0; i <= 10; i++){
            System.out.println(fact.call(i));
        }
    }
}
