package StringToUpperCase;

import StringToUpperCase.Strings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StringsTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    void isBlankShouldReturnTrueForNullOrBlankStrings(String input) {
        Assertions.assertTrue(Strings.isBlank(input));
    }


    //read from csv file
    @ParameterizedTest
    @CsvFileSource(resources = "/csvFile.csv", numLinesToSkip = 1)
    void toUpperCaseShouldGenerateTheExpectedUppercaseValueCSVFile(String input, String expected) {
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
    void toUpperCaseShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }

    //Methods:
    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void isBlankShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
        assertEquals(expected, Strings.isBlank(input));
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of("  ", true),
                Arguments.of("not blank", false)
        );
    }
}