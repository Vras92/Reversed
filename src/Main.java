
public class Main {
    public static void main(String[] args) {
        //        String x = InputString.input();
        String x = "a1bcd efg!h";
        //String x = "Labas rytas!";
        Printer.print(x);
        ReverseStr.nonLetters(x);// collecting all non-letters
        x = ReverseStr.reverseWords(x);// splitting string and reversing words
        x = ReverseStr.nonLettersInsert(x);// inserting all non-letters into the same indexes
        Printer.print(x);

    }
}
