package com.example.quicksort.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void bucketSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        int bucketCount = Math.max(1, (max - min) / arr.length + 1);
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int num : arr) {
            int idx = (num - min) / arr.length;
            buckets.get(idx).add(num);
        }
        int idx = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                arr[idx++] = num;
            }
        }
    }
}
