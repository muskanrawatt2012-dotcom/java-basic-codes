class Printer {
    void print(String msg) { System.out.println(msg); }
}
class Report {
    private Printer printer = new Printer();
    void generate() { printer.print("Report generated!"); }
}
