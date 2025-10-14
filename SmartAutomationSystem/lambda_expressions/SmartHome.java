package lambda_expressions;

import interfaces.LightAction;

public class SmartHome {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights ON due to motion detected!");
        LightAction timeTrigger = () -> System.out.println("Dim lights for evening mode.");
        LightAction voiceTrigger = () -> System.out.println("Lights OFF via voice command.");

        motionTrigger.execute();
        timeTrigger.execute();
        voiceTrigger.execute();
    }
}
