public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer Value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String Value: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(45.67);
        System.out.println("Double Value: " + dblBox.get());
    }
}
