package com.YachtInsight.Controllers;

import java.util.ArrayList;

public class MergeSort {

    // Recursive method to perform merge sort on the ArrayList
    public static void mergeSort(ArrayList<ArrayList<Object>> arr, int columnToSort, int low, int high, boolean ascending) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, columnToSort, low, mid, ascending);
            mergeSort(arr, columnToSort, mid + 1, high, ascending);
            merge(arr, columnToSort, low, mid, high, ascending);
        }
    }

    // Helper method to merge two subarrays of the ArrayList
    private static void merge(ArrayList<ArrayList<Object>> arr, int columnToSort, int low, int mid, int high, boolean ascending) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        ArrayList<ArrayList<Object>> leftArr = new ArrayList<>(arr.subList(low, low + leftLength));
        ArrayList<ArrayList<Object>> rightArr = new ArrayList<>(arr.subList(mid + 1, mid + 1 + rightLength));

        // Merge the temporary arrays back into arr[low..high]
        int i = 0, j = 0, k = low;
        while (i < leftLength && j < rightLength) {
            Comparable<Object> leftValue = (Comparable<Object>) leftArr.get(i).get(columnToSort);
            Comparable<Object> rightValue = (Comparable<Object>) rightArr.get(j).get(columnToSort);

            int comparison = leftValue.compareTo(rightValue);
            if ((ascending && comparison <= 0) || (!ascending && comparison >= 0)) {
                arr.set(k, leftArr.get(i));
                i++;
            } else {
                arr.set(k, rightArr.get(j));
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArr[], if there are any
        while (i < leftLength) {
            arr.set(k, leftArr.get(i));
            i++;
            k++;
        }

        // Copy the remaining elements of rightArr[], if there are any
        while (j < rightLength) {
            arr.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }
}