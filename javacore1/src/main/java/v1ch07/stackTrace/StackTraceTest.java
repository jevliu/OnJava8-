package v1ch07.stackTrace;

import java.util.Scanner;

/**
 * @author 刘季伟
 * @implNote 展示一个递归方法中调用的堆栈轨迹
 * @since 2024/10/5 20:27:08
 */
public class StackTraceTest {
    /**
     * Compute the factorial of a number
     * @param n a non-negative integer
     * @return n! = 1 * 2 * 3 * ... * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + ")");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f : frames) {
            System.out.println(f);
        }
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        factorial(n);

    }
}
