package com.parent;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public float calcAddFloat(float number1 , float number2)
    {
        return (number1 + number2);
    }

    public int calcAddInt(int number1 , int number2)
    {
        return number1 + number2;
    }

    public boolean getFound(boolean found)
    {
        return found;
    }

    public boolean getObjectEquality(Object a , Object b)
    {
        return a.equals(b);
    }

    public boolean getObjectIdentity(Object a , Object b)
    {
        return a.getClass() == b.getClass();
    }

    public String getStateNull(String a)
    {
        return a ;
    }

    public boolean getStateString(String a , String b) throws InterruptedException {
        Thread.sleep(1000);
        return a.equals(b);
    }


    public boolean checkArray(int array1[] , int array2[])
    {
        return array1[0] == array2[0];
    }


    public int devideNum(int number1 , int number2)
    {
        return number1/number2;
    }



}



