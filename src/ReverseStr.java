
class ReverseStr {

    public static String reverse(String str) {
        System.out.println("Your input: " + str);
        if (str.isEmpty()) return str;

        String result = "";
        char [] notLetters = new char[str.length()];
        int [] notLettersIndex = new int[str.length()];
        int j = 0;
        //Collecting all letters in reversed order
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        //Collecting all non-letters and their indexes
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                notLetters[j] = str.charAt(i);
                notLettersIndex[j] = i;
                j++;
            }
        }
        //Placing non-letters in reversed string of input
        StringBuilder sb = new StringBuilder(result);
        for (int i = 0; i < notLettersIndex.length; i++) {
            if (notLetters[i] != '\0') sb.insert(notLettersIndex[i], notLetters[i]);
        }
        return "Result: " + sb.toString();
    }
}