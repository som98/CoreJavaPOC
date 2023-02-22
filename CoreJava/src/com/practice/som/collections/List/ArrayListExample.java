package com.practice.som.collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

        public static void main(String[] args)
        {


            List<String> l1 = List.of("Apple","Bat","Cat","Dog");
            List<String> l2= new ArrayList<>(l1);

/////////////Iterator can understand what datatype to take///////////////
//            Iterator itr= l2.iterator();
//
//            while (itr.hasNext()){
//                System.out.println(itr.next());
//            }


            Iterator<String> itr= l2.iterator();

            while(itr.hasNext()){
                if(itr.next().endsWith("at")){
                    itr.remove();
                }
            }

            System.out.println(l2);


        }
}

