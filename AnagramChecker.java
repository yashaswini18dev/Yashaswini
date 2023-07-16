import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = checkAnagram(str1, str2);
        System.out.println(result);

        str1 = "restful";
        str2 = "fluster";
        result = checkAnagram(str1, str2);
        System.out.println(result);
    }

    public static boolean checkAnagram(String str1, String str2) {

        str1 = str1.toLowerCase().replaceAll("[^a-z]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-z]", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
