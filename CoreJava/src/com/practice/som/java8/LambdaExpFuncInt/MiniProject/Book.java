package com.practice.som.java8.LambdaExpFuncInt.MiniProject;

public class Book {

    private int no;
    private String name;
    private int pages;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(int no, String name, int pages) {
        this.no = no;
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
