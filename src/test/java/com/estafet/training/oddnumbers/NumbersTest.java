package com.estafet.training.oddnumbers;

import com.estafet.training.Numbers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void isOdd_ShouldReturnTrueForOddNumbers (int number) {
        assertTrue(Numbers.isOdd(number));
    }


}