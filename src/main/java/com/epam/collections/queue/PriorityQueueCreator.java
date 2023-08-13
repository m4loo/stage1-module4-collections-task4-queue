package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);

        Collections.sort(list);

        Comparator<String> comparator = (o1, o2) -> o2.compareTo(o1);
        PriorityQueue<String> queue = new PriorityQueue<>(comparator);
        queue.addAll(list);
        return queue;
    }
}
