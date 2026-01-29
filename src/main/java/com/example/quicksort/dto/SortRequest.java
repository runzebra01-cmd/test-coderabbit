package com.example.quicksort.dto;

/**
 * 排序请求 DTO
 */
public class SortRequest {
    
    private int[] numbers;

    public SortRequest() {
    }

    public SortRequest(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
