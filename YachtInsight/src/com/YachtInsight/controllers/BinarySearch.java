package com.YachtInsight.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class BinarySearch {

    // Perform binary search on the sorted list of unique values in the specified column
    public ArrayList<Integer> binarySearchAll(DefaultTableModel model, String searchTerm, int columnIndex) {
        // Create a temporary map to associate each row's value with its original index
        Map<String, ArrayList<Integer>> valueToIndexMap = new HashMap<>();

        int rowCount = model.getRowCount();

        // Populate the temporary map with the table data
        for (int i = 0; i < rowCount; i++) {
            String cellValue = model.getValueAt(i, columnIndex).toString().trim().toLowerCase().replaceAll("\\s+", "");
            
            // If the value is not in the map, create a new ArrayList
            valueToIndexMap.computeIfAbsent(cellValue, k -> new ArrayList<>()).add(i);
        }

        // Create a list of the unique values and sort them
        ArrayList<String> sortedValues = new ArrayList<>(valueToIndexMap.keySet());
        Collections.sort(sortedValues);

        // Perform binary search on the sorted list
        ArrayList<Integer> results = new ArrayList<>();
        int low = 0;        
        int high = sortedValues.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            String midValue = sortedValues.get(mid);
            int compareResult = midValue.compareTo(searchTerm);

            if (compareResult == 0) {
                results.addAll(valueToIndexMap.get(midValue));
                
                // Check for additional occurrences on the left and right
                int left = mid - 1;
                int right = mid + 1;

                // Search left for additional occurrences
                while (left >= 0 && sortedValues.get(left).equals(searchTerm)) {
                    results.addAll(valueToIndexMap.get(sortedValues.get(left)));
                    left--;
                }

                // Search right for additional occurrences
                while (right < sortedValues.size() && sortedValues.get(right).equals(searchTerm)) {
                    results.addAll(valueToIndexMap.get(sortedValues.get(right)));
                    right++;
                }

                return results;
            } else if (compareResult < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return results;
    }
}