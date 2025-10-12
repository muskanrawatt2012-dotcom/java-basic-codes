interface DataExporter {
    void export(String data);
    default void exportToJSON(String data) {
        System.out.println("Exporting data as JSON: " + data);
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting data as CSV: " + data);
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        CSVExporter c = new CSVExporter();
        c.export("Report Data");
        c.exportToJSON("Report Data");
    }
}
