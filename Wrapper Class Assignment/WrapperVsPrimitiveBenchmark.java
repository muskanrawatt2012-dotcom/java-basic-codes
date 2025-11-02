import java.util.ArrayList;

public class WrapperVsPrimitiveBenchmark {
  public static void main(String[] args) {
    final int N = 1_000_000;

    long t1 = System.nanoTime();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) arr[i] = i;
    long sumArr = 0;
    for (int v : arr) sumArr += v;
    long t2 = System.nanoTime();

    long t3 = System.nanoTime();
    ArrayList<Integer> list = new ArrayList<>(N);
    for (int i = 0; i < N; i++) list.add(i);
    long sumList = 0;
    for (Integer v : list) sumList += v;
    long t4 = System.nanoTime();

    System.out.println("int[] sum=" + sumArr + ", time(ms)=" + (t2 - t1) / 1_000_000.0);
    System.out.println("ArrayList<Integer> sum=" + sumList + ", time(ms)=" + (t4 - t3) / 1_000_000.0);
  }
}
