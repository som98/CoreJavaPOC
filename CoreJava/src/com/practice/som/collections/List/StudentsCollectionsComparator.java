package com.practice.som.collections.List;

import java.util.Comparator;

public class StudentsCollectionsComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return Integer.compare(s1.getNo(), s2.getNo());
        //return s1.getName().compareTo(s2.getName());
    }
}
