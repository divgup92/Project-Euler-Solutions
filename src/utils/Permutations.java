package utils;

import java.util.ArrayList;
import java.util.List;

import static utils.Array.formLongFromArray;
import static utils.Array.swap;

public class Permutations {

    public static List<Long> getAllPermutations(int[] array, int start, int end) {
        List<Long> p = new ArrayList<>();
        int[] indexes = new int[end - start];
        int[] elements = new int[end - start];
        for (int i = start; i < end; i++) {
            indexes[i] = 0;
            elements[i] = array[i];
        }

        p.add(formLongFromArray(elements));

        int i = 0;
        while (i < elements.length) {
            if (indexes[i] < i) {
                swap(elements, i % 2 == 0 ? 0 : indexes[i], i);
                p.add(formLongFromArray(elements));
                indexes[i]++;
                i = 0;
            } else {
                indexes[i++] = 0;
            }
        }
        return p;
    }
}
