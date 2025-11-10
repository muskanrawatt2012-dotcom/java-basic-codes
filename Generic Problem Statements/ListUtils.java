import java.util.List;

public class ListUtils {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new java.util.ArrayList<>();
        List<Integer> src = List.of(1, 2, 3);
        copyList(dest, src);
        System.out.println(dest);
    }
}
