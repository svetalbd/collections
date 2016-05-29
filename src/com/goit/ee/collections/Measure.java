package com.goit.ee.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Сергей on 25.05.2016.
 */
public class Measure {

    private final int cycles = 100;

    private long timeAdd = 0;
    private long timeGet = 0;
    private long timeRemove = 0;
    private long timeContains = 0;
    private long timePopulate = 0;
    private long timeIteratorAdd = 0;
    private long timeIteratorRemove = 0;


    public String[][] measure (int i) {

        Random random = new Random();
        for (int iter = 0; iter < cycles; iter++){
            TimerArrayList arrayList = new TimerArrayList();
            timePopulate += arrayList.populate(i);
            timeRemove += arrayList.remove(random.nextInt(i));
            timeContains += arrayList.contains(random.nextInt(i));
            timeGet += arrayList.get(random.nextInt(i));
            timeAdd += arrayList.add(random.nextInt(i));
            timeIteratorAdd += arrayList.iteratorAdd(random.nextInt(i));
            timeIteratorRemove += arrayList.iteratorRemove();

        }
        String[] dataArray = {"ArrayList", String.valueOf(timeAdd / cycles), String.valueOf(timeGet / cycles),
                String.valueOf(timeRemove / cycles), String.valueOf(timeContains / cycles), String.valueOf(timePopulate / cycles),
                String.valueOf(timeIteratorAdd / cycles), String.valueOf(timeIteratorRemove / cycles)};

        setToZero();

        for (int iter = 0; iter < cycles; iter++){
            TimerLinkedList arrayList = new TimerLinkedList();
            timePopulate += arrayList.populate(i);
            timeRemove += arrayList.remove(random.nextInt(i));
            timeContains += arrayList.contains(random.nextInt(i));
            timeGet += arrayList.get(random.nextInt(i));
            timeAdd += arrayList.add(random.nextInt(i));
            timeIteratorAdd += arrayList.iteratorAdd(random.nextInt(i));
            timeIteratorRemove += arrayList.iteratorRemove();

        }
        String[] dataLinkedList = {"LinkedList", String.valueOf(timeAdd / cycles), String.valueOf(timeGet / cycles),
                String.valueOf(timeRemove / cycles), String.valueOf(timeContains / cycles), String.valueOf(timePopulate / cycles),
                String.valueOf(timeIteratorAdd / cycles), String.valueOf(timeIteratorRemove / cycles)};

        setToZero();

        for (int iter = 0; iter < cycles; iter++){
            TimerHashSet arrayList = new TimerHashSet();
            timePopulate += arrayList.populate(i);
            timeRemove += arrayList.remove(random.nextInt(i));
            timeContains += arrayList.contains(random.nextInt(i));
            timeGet += arrayList.get(random.nextInt(i));
            timeAdd += arrayList.add(random.nextInt(i));
            timeIteratorAdd += arrayList.iteratorAdd(random.nextInt(i));
            timeIteratorRemove += arrayList.iteratorRemove();

        }

        String[] dataHashSet = {"HashSet", String.valueOf(timeAdd / cycles), String.valueOf(timeGet / cycles),
                String.valueOf(timeRemove / cycles), String.valueOf(timeContains / cycles), String.valueOf(timePopulate / cycles),
                String.valueOf(timeIteratorAdd / cycles), String.valueOf(timeIteratorRemove / cycles)};

        setToZero();

        for (int iter = 0; iter < cycles; iter++){
            TimerTreeSet arrayList = new TimerTreeSet();
            timePopulate += arrayList.populate(i);
            timeRemove += arrayList.remove(random.nextInt(i));
            timeContains += arrayList.contains(random.nextInt(i));
            timeGet += arrayList.get(random.nextInt(i));
            timeAdd += arrayList.add(random.nextInt(i));
            timeIteratorAdd += arrayList.iteratorAdd(random.nextInt(i));
            timeIteratorRemove += arrayList.iteratorRemove();

        }

        String[] dataTree = {"TreeSet", String.valueOf(timeAdd / cycles), String.valueOf(timeGet / cycles),
                String.valueOf(timeRemove / cycles), String.valueOf(timeContains / cycles), String.valueOf(timePopulate / cycles),
                String.valueOf(timeIteratorAdd / cycles), String.valueOf(timeIteratorRemove / cycles)};

       setToZero();

        String[][] data =  {dataArray, dataLinkedList, dataHashSet, dataTree};

        return data;
    }

    public void setToZero(){
        timeAdd = 0;
        timeGet = 0;
        timeRemove = 0;
        timeContains = 0;
        timePopulate = 0;
        timeIteratorAdd = 0;
        timeIteratorRemove = 0;
    }
}
