package com.goit.ee.collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Mykhailenko Svitlana on 25.05.2016.
 */
public class TimerLinkedList extends TimerCollection {
    private LinkedList<Integer> linkedList = new LinkedList<Integer>();

    @Override
    public long populate(int i) {
        long result = 0L;
        long start = System.nanoTime();
        for (int j = 0; j < i; j++){
            linkedList.add(j, j);
        }
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long add(int i) {

        long result = 0L;
        long start = System.nanoTime();
        linkedList.add(i, i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long get(int i) {
        long result = 0L;
        long start = System.nanoTime();
        linkedList.get(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long remove(int i) {
        long result = 0L;
        long start = System.nanoTime();
        linkedList.remove(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long contains(int i) {
        long result = 0L;
        long start = System.nanoTime();
        linkedList.contains(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long iteratorAdd(int i) {
        long result = 0L;
        long start = System.nanoTime();
        linkedList.listIterator().add(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long iteratorRemove() {
        long result = 0L;
        ListIterator listIterator = linkedList.listIterator();
        listIterator.next();
        long start = System.nanoTime();
        listIterator.remove();
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public void clear(){
        linkedList = new LinkedList<Integer>();
    }
}
