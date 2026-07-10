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
        int actual=obj.add(5,6);
        assertEquals(expect,actual);
    }

    @Test
    public void subtractiontest(){
        App obj =new App();
        int expect=5;
        int actual=obj.sub(9,4);
        assertEquals(expect,actual);
    }
}
