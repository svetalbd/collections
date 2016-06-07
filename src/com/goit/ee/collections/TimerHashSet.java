package com.goit.ee.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Сергей on 25.05.2016.
 */
public class TimerHashSet extends TimerCollection {
    HashSet<Integer> hashSet = new HashSet<Integer>();
    @Override
    public long populate(int i) {
        long result = 0L;
        long start = System.nanoTime();
        Random random = new Random();
        for (int j = 0; j < i; j++){
            hashSet.add(random.nextInt());
        }
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long add(int i) {
        long result = 0L;
        long start = System.nanoTime();
        hashSet.add(i);
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
        hashSet.remove(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long contains(int i) {
        long result = 0L;
        long start = System.nanoTime();
        hashSet.contains(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long iteratorAdd(int i) { return 0; }

    @Override
    public long iteratorRemove() {
        long result = 0L;
        Iterator iterator = hashSet.iterator();
        iterator.next();
        long start = System.nanoTime();
        iterator.remove();
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public void clear(){
        hashSet = new HashSet<Integer>();
    }
}
