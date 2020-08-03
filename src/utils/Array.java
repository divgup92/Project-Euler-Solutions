package utils;

public class Array {

    public  static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static Long formLongFromArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++)
            sb.append(array[i]);
        return Long.valueOf(sb.toString());
    }
}
