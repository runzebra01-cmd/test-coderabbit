package com.example.quicksort.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 快速排序服务测试类
 */
class QuickSortServiceTest {

    private QuickSortService quickSortService;

    @BeforeEach
    void setUp() {
        quickSortService = new QuickSortService();
    }

    @Test
    void testQuickSort_normalArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testQuickSort_alreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testQuickSort_reverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testQuickSort_withDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testQuickSort_singleElement() {
        int[] input = {42};
        int[] expected = {42};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testQuickSort_emptyArray() {
        int[] input = {};
        int[] expected = {};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testQuickSort_nullArray() {
        int[] result = quickSortService.quickSort(null);
        
        assertNull(result);
    }

    @Test
    void testQuickSort_negativeNumbers() {
        int[] input = {-5, 3, -1, 0, 2, -8};
        int[] expected = {-8, -5, -1, 0, 2, 3};
        
        int[] result = quickSortService.quickSort(input);
        
        assertArrayEquals(expected, result);
    }
}
