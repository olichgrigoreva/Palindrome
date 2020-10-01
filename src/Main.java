import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (LineNumberReader lnr = new LineNumberReader(new FileReader("input.txt"))) {
            String line;
            while ((line = lnr.readLine()) != null) {
                System.out.printf("Строка '%s' - палиндром: %s \n", line, isPalindrome(line));
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        int j = length - 1;
        for (int i = 0; i < length / 2; i++) {

            if (chars[i] != chars[j]) {
                return false;
            } else {
                j--;
            }
        }
        return true;
    }

    public static boolean isPalindromeReverseUse(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
