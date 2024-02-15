package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        // 1 2 *3 4 5 *6 7 8 *9 10
        // 1 *2 4 5 *7 8 10
        // *1 4 5 *8 10
        // 4 *5 10
        // 4 *10
        // *4
        // 3 6 9 2 7 1 8 5 10 4
        Queue<Integer> dishes = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        Queue<Integer> buffer = new ArrayDeque<>();
        int counter = 1;
        while (!dishes.isEmpty()) {
            int bufSize = dishes.size();
            for(int i = 0; i < bufSize; i++){
                if(counter % everyDishNumberToEat == 0){
                    result.add(dishes.poll());
                    counter = 1;
                    continue;
                }
                buffer.add(dishes.poll());
                counter++;
            }
            dishes.clear();
            dishes.addAll(buffer);
            buffer.clear();
        }
        return result;
    }
}