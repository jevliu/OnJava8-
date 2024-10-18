package v1ch09;

import java.util.Arrays;

/**
 * @author 刘季伟
 * @implNote 归并排序
 * @since 2024/10/18 14:30:14
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return; // 基本情况，无需排序
        int mid = arr.length / 2;

        // 分割数组
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // 递归调用左右两个子数组
        mergeSort(left);
        mergeSort(right);

        // 最后将已经有序的子数组合并成一个有序的数组
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0; // i为left数组中元素下班，j为right数组中元素的下班，k为最终排序后数组中元素的下标

        // 进行合并，知道将较短数组中的元素都添加都arr 中
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        // 合并剩余的元素
        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 53, 3, 9, 83, 10};
        mergeSort(arr);
        System.out.println("排序后的数组：");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
