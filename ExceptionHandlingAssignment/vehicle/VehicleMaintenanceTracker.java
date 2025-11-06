package ExceptionHandlingAssignment.vehicle;

import java.time.LocalDate;

public class VehicleMaintenanceTracker {
    private LocalDate serviceDueDate;
    private int mileage;

    public VehicleMaintenanceTracker(LocalDate serviceDueDate, int mileage) {
        this.serviceDueDate = serviceDueDate;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative.");
        if (LocalDate.now().isAfter(serviceDueDate)) throw new ServiceOverdueException("Service is overdue since " + serviceDueDate);
        System.out.println("Maintenance OK.");
    }

    public static void main(String[] args) {
        VehicleMaintenanceTracker v = new VehicleMaintenanceTracker(LocalDate.now().minusDays(2), 12000);
        try {
            v.checkMaintenance();
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println("Alert: " + e.getMessage());
        }
    }
}
