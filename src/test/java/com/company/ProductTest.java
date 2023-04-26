package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void test1(){
        int year = 2010;
        int month = 3;
        int expected = 2;
        int result = Product.priceIndex(year,month);
        assertEquals(expected,result);
    }
    @Test
    void test2(){
        int year = 2000;
        int month = 3;
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Product.priceIndex(year,month);
        });
    }

    private static Stream<Arguments> getMonthYearStream() {
        return Stream.of(
                Arguments.of(2010,3,2),
                Arguments.of(2012,12,35),
                Arguments.of(2022,3,146)
        );
    }

    @ParameterizedTest
    @MethodSource("getMonthYearStream")
    void test3(int year, int month, int expected) {
        int result = Product.priceIndex(year,month);
        assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv", numLinesToSkip = 1, delimiterString = ";:" )
    void test4(int year, int month, int expected) {
        int result = Product.priceIndex(year,month);
        assertEquals(expected,result);
    }

}