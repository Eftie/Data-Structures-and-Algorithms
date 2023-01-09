import java.lang.Math;
import java.util.ArrayList;

// every single night i pray that job recruiters dont look at my code

public class ArmstrongNum {
    public static boolean isNarcissistic(int val) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int digitAmt = 0, newVal = val;

        while (newVal > 0) {
            digits.add(0, newVal % 10);
            newVal /= 10;
            digitAmt++;
        }

        System.out.println(digitAmt);

        double compare = 0;
        for (int i = 0; i < digits.size(); i++) {
            compare += Math.pow(digits.get(i), digitAmt);
            System.out.println(compare);
        }

        if (compare == (double) val) return true;
        return false;
    }
}
