package com.goit.ee.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by Mykhailenko Svitlana on 25.05.2016.
 */
public class TimerArrayList  extends TimerCollection {
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public long populate(int i){
        long result = 0L;
        long start = System.nanoTime();
        for (int j = 0; j < i; j++){
            list.add(j, j);
        }
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long iteratorRemove() {
        long result = 0L;
        ListIterator listIterator = list.listIterator();
        listIterator.next();
        long start = System.nanoTime();
        listIterator.remove();
        long end = System.nanoTime();
        return result = end - start;
    }


    @Override
    public long add(int i) {
        long result = 0L;
        long start = System.nanoTime();
        list.add(i, i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long get(int i){
        long result = 0L;
        long start = System.nanoTime();
        list.get(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long remove(int i){
        long result = 0L;
        long start = System.nanoTime();
        list.remove(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public long contains (int i){
        long result = 0L;
        long start = System.nanoTime();
        list.contains(i);
        long end = System.nanoTime();
        return result = end - start;
    }



    @Override
    public long iteratorAdd(int i) {
        long result = 0L;
        long start = System.nanoTime();
        list.listIterator().add(i);
        long end = System.nanoTime();
        return result = end - start;
    }

    @Override
    public void clear(){
        list = new ArrayList<>();
    }

}
