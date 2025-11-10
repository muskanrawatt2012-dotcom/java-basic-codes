public class MaximumFinder {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(3, 7, 5));           // 7
        System.out.println(maximum(6.6, 8.8, 7.7));     // 8.8
        System.out.println(maximum("apple", "pear", "peach")); // pear
    }
}
