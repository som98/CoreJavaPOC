package com.practice.som.collections.List;

import java.util.*;

public class StudentsCollectionRunner {

    public static void main(String[] args) {
        List <Student> student = List.of(
                new Student(5,"Som"),
                new Student(2,"Sam"),
                new Student(1,"Mitu"));

        List <Student> studentAl = new ArrayList<>(student);

        System.out.println(student);

        Collections.sort(studentAl);

        System.out.println("Asc: "+studentAl);

        //Collections.sort(studentAl, new StudentsCollectionsComparator());
        studentAl.sort(new StudentsCollectionsComparator());

        System.out.println("Desc: "+studentAl);

    }
}
