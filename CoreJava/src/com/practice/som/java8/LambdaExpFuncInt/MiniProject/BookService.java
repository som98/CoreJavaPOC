package com.practice.som.java8.LambdaExpFuncInt.MiniProject;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksinSort(){
        List<Book> books= new BookDAO().getBooks();

        //Not using Lambda Function
        //Collections.sort(books,new MyComparator());

        //Using Lambda Function to sort w.r.t a String
        Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName()));
        
        //Using Lambda Function to sort w.r.t an integer
        //Collections.sort(books, (o1,o2)->Integer.compare(o1.getNo(), o2.getNo()));

        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }

}


//Not using Lambda Function
/*
class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
        //return Integer.compare(o1.getPages(), o2.getPages());
    }
}*/
