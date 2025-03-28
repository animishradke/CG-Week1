import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OTPGenerator {

    private static final int OTP_LENGTH = 6;

    public static int generateOneTimePassword() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(random.nextInt(10));
        }
        return Integer.parseInt(otp.toString());
    }

    public static int[] generateMultipleOneTimePasswords(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOneTimePassword();
        }
        return otps;
    }

    public static boolean checkIfOTPsAreUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int numberOfOTPs = 10;
        int[] generatedOTPs = generateMultipleOneTimePasswords(numberOfOTPs);

        System.out.println("Generated OTPs:");
        for (int otp : generatedOTPs) {
            System.out.println(otp);
        }

        boolean areUnique = checkIfOTPsAreUnique(generatedOTPs);
        System.out.println("\nAre all OTPs unique? " + areUnique);
    }
}