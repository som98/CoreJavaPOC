package com.practice.som.collections.List;

public class StudentString implements Comparable<StudentString>{

    private String name;

    public StudentString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentString args) {
        return name.compareTo(args.name);
    }
}
