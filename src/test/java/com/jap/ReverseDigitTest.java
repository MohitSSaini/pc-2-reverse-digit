package com.jap;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseDigitTest {
    ReverseDigit reverseDigit;

    @BeforeEach
    public void setUp() {
        reverseDigit = new ReverseDigit ();

    }
    
    @AfterEach
    public void tearDown() {
        reverseDigit = null;

    }
  
    @Test
    void givenInputPositiveNumberReverseTheDigit(){
        int inputValue = 4758765;
        //Expected Value
        int expectedValue = 5678574;
        //Inserting Value
        int actualOutput = reverseDigit.getReverse(inputValue);
        //Assertion
        Assertions.assertEquals ( expectedValue,actualOutput );
        
    }
    @Test
    void givenInputNegativeNumberReverseTheDigit(){
        int inputValue = -246567;
        //Expected Value
        int expectedValue = -765642;
        //Inserting Value
        int actualOutput = reverseDigit.getReverse(inputValue);
        //Assertion
        Assertions.assertEquals ( expectedValue,actualOutput );
    }
}