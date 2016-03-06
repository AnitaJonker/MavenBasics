package com.parent;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase

{
    Libary lib = new Libary();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testLibaryName()
    {
        assertEquals(lib.getLibaryName("Durbanville"),"Durbanville");
    }

    public void testSearchName()
    {
        assertEquals(lib.getLibaryName("I remember"),"I remember");
    }
}
