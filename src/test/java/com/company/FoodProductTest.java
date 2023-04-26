package com.company;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodProductTest {
    @Test
    void test1(){
        FoodProduct first = FoodProduct.fromCsv(Path.of("C:\\Users\\student\\Projects\\new\\programowanie_obiektowe_14_sr\\src\\test\\resources\\buraki.csv"));
        assertEquals("Buraki - za 1 kg",first.getName());
    }
    @Test
    void test2(){
        FoodProduct first = FoodProduct.fromCsv(Path.of("C:\\Users\\student\\Projects\\new\\programowanie_obiektowe_14_sr\\src\\test\\resources\\buraki.csv"));
        double price = first.getPrice(2010,3,"DOLNOŚLĄSKIE");
        assertEquals(1.57,price);
    }
}
