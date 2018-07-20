import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long sum_in_cheat = 0;
        long sum_in_norm = 0;
        long sum_in = 0;
        int amount = 3000;
        for (int i = 0; i < amount; i++) {
            long startTime = System.nanoTime();
            cheatReverse("asasasasasa");
            long endTime = System.nanoTime();
            sum_in_cheat += (endTime - startTime);
        }

        System.out.println("in cheat: " + sum_in_cheat / amount);

        for (int i = 0; i < amount; i++) {
            long startTime = System.nanoTime();
            normReverse("asasasasasa");
            long endTime = System.nanoTime();
            sum_in_norm += (endTime - startTime);
        }

        System.out.println("in norm: " + sum_in_norm / amount);

    for (int i = 0; i < amount; i++) {
            long startTime = System.nanoTime();
            reverse("asasasasasa");
            long endTime = System.nanoTime();
            sum_in += (endTime - startTime);
        }

        System.out.println("in : " + sum_in / amount);
    }

    public static String reverse(String s) {
        List<String> tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i + 1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    public static String normReverse(String s) {
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = (s.length() - 1); i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }
        return reversedString.toString();
    }

    public static String cheatReverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }
}