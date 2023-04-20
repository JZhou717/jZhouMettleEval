package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 5, 2, 3};
        int target = 2;
        getIndices(input, target);
    }
    public static int[] getIndices(int[] nums, int target) {
        System.out.println("input nums array: " + Arrays.toString(nums));
        System.out.println("target: " + target);

        int countSmaller = 0;
        int count = 0;

        // alternate, sort input array and mark indices in arraylist. Convert arraylist to array of ints and return

        for(int n : nums) {
            if(n < target) {
                countSmaller++;
            } else if(n == target) {
                count++;
            }
        }

        int[] ans = new int[count];
        for(int i = 0; i < count; i++) {
            ans[i] = countSmaller++;
        }

        System.out.println("output: " + Arrays.toString(ans) + "\n");

        return ans;
    }
}