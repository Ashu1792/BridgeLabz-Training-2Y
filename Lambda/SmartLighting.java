interface LightTrigger {
    void activate();
}

public class SmartLighting {
    public static void main(String[] args) {
        LightTrigger motionTrigger = () -> System.out.println("Motion detected → Lights ON");
        LightTrigger timeTrigger = () -> System.out.println("Evening time → Warm ambient lights");
        LightTrigger voiceTrigger = () -> System.out.println("Voice command 'Party Mode' → Disco lights");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}