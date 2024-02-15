package com.epam.collections.queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>(Arrays.asList("Java", "PriorityQueue", "class"));
        List<String> secondList = new ArrayList<>(Arrays.asList("It", "is", "different", "from", "standard", "queues", "where", "FIFO"));
        PriorityQueue<String> priorityQueue = new PriorityQueueCreator().createPriorityQueue(firstList, secondList);
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println();


        Queue<Integer> firstQueue = new LinkedList<>();
        firstQueue.add(1);
        firstQueue.add(5);
        firstQueue.add(7);
        firstQueue.add(6);
        Queue<Integer> secondQueue = new LinkedList<>();
        secondQueue.add(2);
        secondQueue.add(5);
        secondQueue.add(8);
        secondQueue.add(3);
        ArrayDeque<Integer> test = new ArrayDequeCreator().createArrayDeque(firstQueue, secondQueue);
        while(!test.isEmpty()){
            System.out.print(test.poll() + " ");
        }

        System.out.println();

        List<Integer> dishesOrder = new DishOrderDeterminer().determineDishOrder(10, 3);
        System.out.println(dishesOrder);
    }
}
