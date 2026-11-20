package static2.ex;

public class MathArrayUtils {


    static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    static double average(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return (double) total / arr.length;
    }


    static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
