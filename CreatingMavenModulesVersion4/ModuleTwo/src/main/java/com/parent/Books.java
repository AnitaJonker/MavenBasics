package com.parent;

/**
 * Created by student on 2016/03/06.
 */
public class Books {

    Libary l = new Libary();


    public String getAuthor(String auth)
    {
        return auth;
    }

    public String getBook(String book) { return book;}

    public void getBookAvailable(String bookName)
    {
        String libName = l.getLibaryName("Durbanville");
        System.out.println(libName + "Has" + bookName );
    }





}
