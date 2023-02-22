package com.practice.som.collections.Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner1 {

    public static void main(String[] args) {

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.addAll(List.of("Zebra","Monkey","Cat","Alligator","Deer"));
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());

    }
}
