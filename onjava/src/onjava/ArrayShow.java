package onjava;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 创建一个用于显示数组的可用程序
 * @since 2024/9/4 10:14:27
 */
public interface ArrayShow {
    static void show(Object[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(boolean[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(byte[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(char[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(short[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(long[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(float[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void show(double[] a) {
        System.out.println(Arrays.toString(a));
    }
    // Start with a description
    static void show(String info, Object[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, boolean[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, byte[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, char[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, short[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, int[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, long[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, float[] a) {
        System.out.print(info + ": ");
        show(a);
    }
    static void show(String info, double[] a) {
        System.out.print(info + ": ");
        show(a);
    }

}
