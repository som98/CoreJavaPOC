package com.practice.som.collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class StudentStringCollectionRunner {

    public static void main(String[] args) {
            ArrayList<StudentString> al=new ArrayList<>();
            al.add(new StudentString("Viru"));
            al.add(new StudentString("Saurav"));
            al.add(new StudentString("Mukesh"));
            al.add(new StudentString("Tahir"));

            Collections.sort(al);
            for (StudentString s : al) {
                System.out.println(s.getName());
            }

    }
}
