package com.example.quicksort.service;

import org.springframework.stereotype.Service;

/**
 * 快速排序服务类
 * 实现经典的快速排序算法
 */
@Service
public class QuickSortService {

    /**
     * 对整数数组进行快速排序
     * @param arr 待排序的数组
     * @return 排序后的数组
     */
    public int[] quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        // 创建副本，不修改原数组
        int[] result = arr.clone();
        quickSortRecursive(result, 0, result.length - 1);
        return result;
    }

    /**
     * 快速排序递归实现
     * @param arr 数组
     * @param low 左边界
     * @param high 右边界
     */
    private void quickSortRecursive(int[] arr, int low, int high) {
        while (low < high) {
            int pivotIndex = partition(arr, low, high);
            // 递归处理较小的分区，循环处理较大的分区，减少递归深度
            if (pivotIndex - low < high - pivotIndex) {
                // 左侧较小，递归左侧
                quickSortRecursive(arr, low, pivotIndex - 1);
                low = pivotIndex + 1;
            } else {
                // 右侧较小，递归右侧
                quickSortRecursive(arr, pivotIndex + 1, high);
                high = pivotIndex - 1;
            }
        }
    }

    /**
     * 分区操作
     * 选择最右边的元素作为基准值（pivot）
     * 将小于基准值的元素放到左边，大于基准值的元素放到右边
     * 
     * @param arr 数组
     * @param low 左边界
     * @param high 右边界
     * @return 基准值的最终位置
     */
    private int partition(int[] arr, int low, int high) {
        // 选择最右边的元素作为基准值
        int pivot = arr[high];
        // i 指向小于基准值区域的最后一个元素
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于基准值
            if (arr[j] <= pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                swap(arr, i, j);
            }
        }
        // 将基准值放到正确的位置
        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * 交换数组中两个元素的位置
     * @param arr 数组
     * @param i 索引i
     * @param j 索引j
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
