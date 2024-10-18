package v1ch09;

import java.util.Arrays;

/**
 * @author 刘季伟
 * @implNote 实现快速排序
 * @since 2024/10/18 13:45:20
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 选择最后一个元素作为基准
        int i = low - 1; // i 指针为小于基准元素的最后一个元素的索引，初始化为low-1表示在当前没有小于基准的元素

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot){
                i++; // i以及左侧的元素都小于基准元素，已经有序

                int temp = arr[i]; // 将i和j位置的元素进行交换，确保i及左侧的元素都小于基本元素
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 遍历完成后将基准元素放到正确的位置，确保左右两侧的有序
        int temp = arr[i + 1]; // i+1 位置应该为基准元素应在的位置，所以需要使用临时变量将此位置的原有元素提取保存下来
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // 返回基准的新位置
    }

    public static void main(String[] args) {
//        QuickSort qs = new QuickSort();
        int[] array = {2, 4, 1, 5, 3};

        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println("经过快速排序后的数组：" + Arrays.toString(array));
    }
}
