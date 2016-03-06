package com.parent;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;




/**
 * Created by student on 2016/03/05.
 */
public class AppTest  {
    App app = new App();

    @Test
    public void testInt() {
        Assert.assertEquals(app.calcAddInt(3, 6),9);
    }
    @Test
    public void testFloat() {
        Assert.assertEquals(app.calcAddFloat(4f,6f),10f);
    }

    @Test
    public void testBoolTrue()
    {
        Assert.assertTrue(app.getFound(true));
    }

    @Test
    public void testBoolFalse()
    {
        Assert.assertFalse(app.getFound(false));
    }

    @Test
    public void testObjectEquality()
    {
        MainTester mainTest = new MainTester();
        Assert.assertFalse(app.getObjectEquality(app, mainTest));
    }

    @Test
    public void testObjectIdentity()
    {
        MainTester mainTest = new MainTester();
        Assert.assertTrue(app.getObjectIdentity(app, app));
    }

    @Test
    public void testNullness()
    {
        Assert.assertNull(app.getStateNull(null));
    }

    @Test
    public void testNotNullness()
    {
        Assert.assertNotNull(app.getStateNull("hello"));
    }

    @Test
    @Ignore
    public void testNull()
    {
        Assert.assertNotNull(app.getStateNull("hello"));
    }

    @Test(timeout = 2000)
    public void testTimeOut()
    {
        try {
            Assert.assertTrue(app.getStateString("THIS IS LONG", "THIS IS LONG"));
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }

    @Test
    public void testArray()
    {
        int arr[] = new  int[1];
        int arr2[] = new int[1];
        arr[0] = 5;
        arr2[0] = 5;
        Assert.assertTrue(app.checkArray(arr,arr2));
    }

    @Test (expected = ArithmeticException.class)
    public void testException() {

        app.devideNum(20,0);
    }



}
