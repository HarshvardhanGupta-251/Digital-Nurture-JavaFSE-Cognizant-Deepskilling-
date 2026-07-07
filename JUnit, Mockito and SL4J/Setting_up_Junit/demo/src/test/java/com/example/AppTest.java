package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void additiontest()
    {

        App obj=new App();
        int expect=11;
        int actual=App.add(5,6);
        assertEquals(expect,actual);
    }
}
