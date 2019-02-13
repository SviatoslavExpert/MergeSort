package com.gmail.granovskiy.s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        MergeSort.process(getArray());
    }

    private static int[] getArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: ");
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[count];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return arr;
    }
}
