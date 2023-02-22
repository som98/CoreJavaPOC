package com.practice.som.java8.LambdaExpFuncInt.MiniProject;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks()
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"CoreJava",500));
        books.add(new Book(2,"Spring",600));
        books.add(new Book(3,"WebService",700));
        books.add(new Book(4,"Cloud",800));
        books.add(new Book(5,"Hibernate",200));

        return books;
    }
}
