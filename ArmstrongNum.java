import java.lang.Math;
import java.util.ArrayList;

// every single night i pray that job recruiters dont look at my code

public class ArmstrongNum {
    public static boolean isNarcissistic(int val) {
        // Arraylist to save individual digits
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int digitAmt = 0, newVal = val;

        // gets the individual digits and saves them
        while (newVal > 0) {
            digits.add(0, newVal % 10);
            newVal /= 10;
            digitAmt++;
        }

        // raises each individual digit to the power of digit amt and compares to val
        double compare = 0;
        for (int i = 0; i < digits.size(); i++) {
            compare += Math.pow(digits.get(i), digitAmt);
            System.out.println(compare);
        }

        if (compare == (double) val) return true;
        return false;
    }
}
