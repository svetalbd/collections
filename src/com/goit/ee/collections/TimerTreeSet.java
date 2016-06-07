package com.goit.ee.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Mykhailenko Svitlana on 25.05.2016.
 */
public class TimerTreeSet extends TimerCollection {
    private TreeSet<Integer> treeSet = new TreeSet<Integer>();

    @Override
    public long populate(int i) {
        long result = 0L;
        long start = System.nanoTime();
        Random random = new Random();
        for (int j = 0; j < i; j++){
            treeSet.add(random.nextInt());
        }
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long add(int i) {
        long result = 0L;
        long start = System.nanoTime();
        treeSet.add(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long get(int i) {
        return 0;
    }

    @Override
    public long remove(int i) {
        long result = 0L;
        long start = System.nanoTime();
        treeSet.remove(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long contains(int i) {
        long result = 0L;
        long start = System.nanoTime();
        treeSet.contains(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long iteratorAdd(int i) {
        return 0;
    }

    @Override
    public long iteratorRemove() {
        long result = 0L;
        Iterator iterator = treeSet.iterator();
        iterator.next();
        long start = System.nanoTime();
        iterator.remove();
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public void clear(){
        treeSet = new TreeSet<Integer>();
    }
}
