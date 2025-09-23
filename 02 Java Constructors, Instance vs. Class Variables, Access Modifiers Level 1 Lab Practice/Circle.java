class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(7.5);

        c1.display();
        System.out.println();
        c2.display();
    }
}
