public class findMaxMin {
 
    public static int getMax(int[] array, int index) {
        if (index <= 0) return array[0];

        return Math.max(array[index], getMax(array, index-1));
    }

    public static int getMin (int[] array, int index) {
        if (index <= 0) return array[0];

        return Math.min(array[index], getMin(array, index-1));
    }
}
