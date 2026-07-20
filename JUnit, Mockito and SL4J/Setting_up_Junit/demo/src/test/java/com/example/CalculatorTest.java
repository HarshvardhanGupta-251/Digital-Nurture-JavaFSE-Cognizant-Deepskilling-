package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.Calculator;

//AAA Pattern   
/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void additiontest()
    {
        // Arrange 
        Calculator obj=new Calculator();
        
        // Act  
        int expect=11;
        int actual=obj.add(5,6);

        //Assert
        assertEquals(expect,actual);
    }

    @Test
    public void subtractiontest(){
        Calculator obj =new Calculator();
        int expect=5;
        int actual=obj.sub(9,4);
        assertEquals(expect,actual);
    }
}
