package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    // Given sample test 1
    public void sampleTest1() {
        int[] input = new int[]{1, 2, 5, 2, 3};
        int target = 2;

        int[] output = new int[]{1, 2};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }

    @Test
    // Given sample test 2
    public void sampleTest2() {
        int[] input = new int[]{1, 2, 5, 2, 3};
        int target = 3;

        int[] output = new int[]{3};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }

    @Test
    // empty input array
    public void emptyInputTest() {
        int[] input = new int[]{};
        int target = 3;

        int[] output = new int[]{};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }

    @Test
    // missing target
    public void missingTargetTest() {
        int[] input = new int[]{1, 2, 5, 2, 3};
        int target = 4;

        int[] output = new int[]{};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }

    @Test
    // full input array of target
    public void fullInputTargetTest() {
        int[] input = new int[]{1, 1, 1, 1, 1};
        int target = 1;

        int[] output = new int[]{0, 1, 2, 3, 4};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }

    @Test
    // full input array of target
    public void targetFirstTest() {
        int[] input = new int[]{1, 2, 5, 2, 3};
        int target = 1;

        int[] output = new int[]{0};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }

    @Test
    // full input array of target
    public void targetLastTest() {
        int[] input = new int[]{1, 2, 5, 2, 3};
        int target = 5;

        int[] output = new int[]{4};

        assertEquals(Arrays.toString(output),  Arrays.toString(Main.getIndices(input,target)));
    }
}