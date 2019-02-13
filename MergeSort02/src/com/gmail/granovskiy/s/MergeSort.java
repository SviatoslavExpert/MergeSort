package com.gmail.granovskiy.s;

import java.io.IOException;

public class MergeSort {
    public static void process(int[] array) {
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            startMerge(array, left, mid, right);
        }
    }

    private static void startMerge(int[] array, int left, int mid, int right) {
        int start = mid + 1;
        if (array[mid] <= array[start]) {
            return;
        }
        continueMerge(array, left, mid, right, start);
    }

    private static void continueMerge(int[] array, int left, int mid, int right, int start) {
        while (left <= mid && start <= right) {
            if (array[left] <= array[start]) {
                left++;
            }
            if (array[left] > array[start]) {
                int temp = array[start];
                int index = start;
                iterate(array, index, left);
                array[left] = temp;
                left++;
                mid++;
                start++;
            }
        }
    }

    private static void iterate(int[] array, int index, int left) {
        while (index != left) {
            array[index] = array[index - 1];
            index--;
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
