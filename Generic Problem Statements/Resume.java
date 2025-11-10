import java.util.List;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public static void processPipeline(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing " + role.getClass().getSimpleName());
        }
    }
}
