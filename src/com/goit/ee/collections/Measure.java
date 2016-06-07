package com.goit.ee.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Mykhailenko Svitlana on 25.05.2016.
 */
public class Measure<T extends TimerCollection> {

    OneMeasureRealize oneMeasureRealize;

    public String[][] measure (int i) {

        Random random = new Random();

        TimerArrayList arrayList = new TimerArrayList();
        oneMeasureRealize = new OneMeasureRealize(arrayList);
        String[] dataArray = oneMeasureRealize.oneMeasure(arrayList, i);

        TimerLinkedList linkedList = new TimerLinkedList();
        oneMeasureRealize = new OneMeasureRealize(linkedList);
        String[] dataLinkedList = oneMeasureRealize.oneMeasure(linkedList, i);

        TimerHashSet hashSet = new TimerHashSet();
        oneMeasureRealize = new OneMeasureRealize(hashSet);
        String[] dataHashSet = oneMeasureRealize.oneMeasure(hashSet, i);

        TimerTreeSet timerTreeSet = new TimerTreeSet();
        oneMeasureRealize = new OneMeasureRealize(timerTreeSet);
        String[] dataTree = oneMeasureRealize.oneMeasure(timerTreeSet, i);

        String[][] data =  {dataArray, dataLinkedList, dataHashSet, dataTree};

        return data;
    }

}
