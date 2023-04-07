import org.junit.jupiter.api.*;

class ReverseStrTest {
    String input = "a1bcd efg!h";
    @Test
    @DisplayName("Collect all non-letters")
    void nonLetters() {
        char[] expectedNotLetters = {'1', ' ', '!'};
        int[] expectedNotLettersIndex = {1, 5, 9};
        ReverseStr.nonLetters(input);
        Assertions.assertArrayEquals(expectedNotLetters, ReverseStr.newNotLetters);
        Assertions.assertArrayEquals(expectedNotLettersIndex, ReverseStr.newNotLettersIndex);
    }
    @Test
    @DisplayName("Split string into words and reverse it. Also removes non-letters")
    void reverseWords() {
        String expectedOutput = "dcbahgfe";
        String actualOutput = ReverseStr.reverseWords(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    @DisplayName("Insert non-letters into reversed string")
    void nonLettersInsert() {
        ReverseStr.nonLetters(input);
        String x = ReverseStr.reverseWords(input);
        char[] NewNotLetters = {1, ' ', '!'};
        int[] NewNotLettersIndex = {1, 5, 9};
        String expectedOutput = "d1cba hgf!e";

        String actualOutput = ReverseStr.nonLettersInsert(x);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
