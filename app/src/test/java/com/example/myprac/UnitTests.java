package com.example.myprac;

import org.junit.Test;

import static org.junit.Assert.*;


public class UnitTests
{
    @Test
    public void addition_isCorrect() throws Exception
    {
        assertEquals(4, 2 + 2);
    }

    @Test public void mainActivity_shouldNotBeNull() throws Exception
    {
        MainActivity mainActivity = new MainActivity();
        assertNotNull(mainActivity);
    }

}