package Level3;
import java.util.*;

public class otpgenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); // Ensures 6-digit OTP
    }

    // Method to generate 10 OTPs and store them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    // Main method
    public static void main(String[] args) {
        int[] otps = generateMultipleOTPs(10);

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) {
            System.out.println("✅ All OTPs are unique!");
        } else {
            System.out.println("❌ Duplicate OTPs found!");
        }
    }
}
