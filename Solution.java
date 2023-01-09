import java.util.ArrayList;

public class Solution {
    
    public static String whoLikesIt(ArrayList<String> names) {

        // get ready for some Yandere Dev type s--t

        switch (names.size()) {
            case 0: return "no one likes this";
            case 1: return names.get(0) + " likes this";    
            case 2: return names.get(0) + " and " + names.get(1) + " likes this";
            case 3: return names.get(0) + ", " + names.get(1) + " and " + names.get(2) + " likes this";
            case 4: return names.get(0) + ", " + names.get(1) + " and 2 others likes this";
        }

        return names.get(0) + ", " + names.get(1) + " and " + (names.size() - 2) + " others likes this";
    }
}
