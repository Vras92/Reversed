import org.junit.jupiter.api.*;

class ReverseStrTest {
    String input = "Labas rytas!";
    @Test
    @DisplayName("Collect all non-letters")
    void nonLetters() {
        char[] expectedNotLetters = {' ', '!'};
        int[] expectedNotLettersIndex = {5, 11};
        ReverseStr.nonLetters(input);
        Assertions.assertArrayEquals(expectedNotLetters, ReverseStr.newNotLetters);
        Assertions.assertArrayEquals(expectedNotLettersIndex, ReverseStr.newNotLettersIndex);
    }
    @Test
    @DisplayName("Split string into words and reverse it. Also removes non-letters")
    void reverseWords() {
        String expectedOutput = "sabaLsatyr";
        String actualOutput = ReverseStr.reverseWords(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    @DisplayName("Insert non-letters into reversed string")
    void nonLettersInsert() {
        ReverseStr.nonLetters(input);
        String x = ReverseStr.reverseWords(input);
        char[] NewNotLetters = {' ', '!'};
        int[] NewNotLettersIndex = {5, 11};
        String expectedOutput = "sabaL satyr!";

        String actualOutput = ReverseStr.nonLettersInsert(x);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
