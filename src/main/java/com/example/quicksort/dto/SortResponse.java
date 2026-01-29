
package com.example.quicksort.dto;
import java.util.Arrays;

/**
 * 排序响应 DTO
 */
public class SortResponse {
    
    private int[] originalArray;
    private int[] sortedArray;
    private double executionTimeMs;

    public SortResponse() {
    }

    public SortResponse(int[] originalArray, int[] sortedArray, double executionTimeMs) {
        this.originalArray = (originalArray != null) ? Arrays.copyOf(originalArray, originalArray.length) : null;
        this.sortedArray = (sortedArray != null) ? Arrays.copyOf(sortedArray, sortedArray.length) : null;
        this.executionTimeMs = executionTimeMs;
    }

    public int[] getOriginalArray() {
        return (originalArray != null) ? Arrays.copyOf(originalArray, originalArray.length) : null;
    }

    public void setOriginalArray(int[] originalArray) {
        this.originalArray = (originalArray != null) ? Arrays.copyOf(originalArray, originalArray.length) : null;
    }

    public int[] getSortedArray() {
        return (sortedArray != null) ? Arrays.copyOf(sortedArray, sortedArray.length) : null;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = (sortedArray != null) ? Arrays.copyOf(sortedArray, sortedArray.length) : null;
    }

    public double getExecutionTimeMs() {
        return executionTimeMs;
    }

    public void setExecutionTimeMs(double executionTimeMs) {
        this.executionTimeMs = executionTimeMs;
    }
}
