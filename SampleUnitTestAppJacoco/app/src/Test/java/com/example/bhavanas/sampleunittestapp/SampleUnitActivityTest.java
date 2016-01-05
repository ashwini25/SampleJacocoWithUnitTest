package com.example.bhavanas.sampleunittestapp;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by bhavana.s on 12/30/2015.
 */
public class SampleUnitActivityTest extends TestCase {
    SampleUnitActivity activity;

    public void setUp() throws Exception{
        super.setUp();
        activity=new SampleUnitActivity();
    }
    @Test
    public void testString(){
        String strnmae=activity.cal();
        assertEquals("Android",strnmae);
    }
}
