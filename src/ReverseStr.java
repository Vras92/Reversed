import static java.lang.Character.*;

class ReverseStr {

    static char[] newNotLetters;
    static int[] newNotLettersIndex;
    static int j = 0;
    public static String reverseWords(String str) {
        String[] words = str.split("\\s");
        String rWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            for (int i = 0; i < sb.length(); i++) {
                if (!isLetter(sb.charAt(i))) sb.deleteCharAt(i);
            }
            sb.reverse();
            rWord += sb.toString();
        }
        return rWord.trim();
    }

    public static void nonLetters(String str) {
        char[] notLetters = new char[str.length()];
        int[] notLettersIndex = new int[str.length()];
        j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!isLetter(str.charAt(i))) {
                notLetters[j] = str.charAt(i);
                notLettersIndex[j] = i;
                j++;
            }
        }
        //resize arrays
        newNotLetters = new char[j];
        newNotLettersIndex = new int[j];
        System.arraycopy(notLetters,0,newNotLetters,0,j);
        System.arraycopy(notLettersIndex,0,newNotLettersIndex,0,j);
        notLetters =newNotLetters;
        notLettersIndex =newNotLettersIndex;
    }
    public static String nonLettersInsert(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (int i = 0; i < j; i++) {
            if (newNotLetters[i] != '\0') sb2.insert(newNotLettersIndex[i], newNotLetters[i]);
        }
        return sb2.toString();
    }
}
