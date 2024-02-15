package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        // 1 5 7 6 - first
        // 2 5 8 3 - second

        // ------------------- //

        // 7 6 - f
        // 8 3 - s
        // 1 5 2 5

        // 7 6 5 - f
        // 8 3 - s
        // 1 5 2

        // 5 - f
        // 8 3 - s
        // 1 5 2 7 6

        // 5 - f
        // 8 3 6 - s
        // 1 5 2 7

        // ------------------- //

        // 5 - f
        // 6 - s
        // 1 5 2 7 8 3

        // ------------------- //

        //  - f
        //  - s
        // 1 5 2 7 8 5 6 3


        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(firstQueue.remove());
        result.add(firstQueue.remove());
        result.add(secondQueue.remove());
        result.add(secondQueue.remove());

        while(!secondQueue.isEmpty()){
            firstQueue.add(result.removeLast());
            result.add(firstQueue.remove());
            result.add(firstQueue.remove());
            secondQueue.add(result.removeLast());
            result.add(secondQueue.remove());
            result.add(secondQueue.remove());
        }
        return result;
    }
}