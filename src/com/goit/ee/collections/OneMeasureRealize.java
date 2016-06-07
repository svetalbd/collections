package com.goit.ee.collections;

import java.util.Random;

/**
 * Created by Mykhailenko Svitlana on 07.06.2016.
 */
public class OneMeasureRealize<T extends TimerCollection> implements OneMeasure {
    T typedObject;

    private final int cycles = 100;

    private long timeAdd = 0;
    private long timeGet = 0;
    private long timeRemove = 0;
    private long timeContains = 0;
    private long timePopulate = 0;
    private long timeIteratorAdd = 0;
    private long timeIteratorRemove = 0;
    Random random = new Random();

    public OneMeasureRealize(T object) {
        this.typedObject = object;
    }

    @Override
    public String[] oneMeasure(TimerCollection object, int i) {
        for (int iter = 0; iter < cycles; iter++){
            typedObject.clear();
            timePopulate += typedObject.populate(i);
            timeRemove += typedObject.remove(random.nextInt(i));
            timeContains += typedObject.contains(random.nextInt(i));
            timeGet += typedObject.get(random.nextInt(i));
            timeAdd += typedObject.add(random.nextInt(i));
            timeIteratorAdd += typedObject.iteratorAdd(random.nextInt(i));
            timeIteratorRemove += typedObject.iteratorRemove();

        }

        String[] dataArray = {object.getClass().getName(), String.valueOf(timeAdd / cycles), String.valueOf(timeGet / cycles),
                String.valueOf(timeRemove / cycles), String.valueOf(timeContains / cycles), String.valueOf(timePopulate / cycles),
                String.valueOf(timeIteratorAdd / cycles), String.valueOf(timeIteratorRemove / cycles)};

        setToZero();

        return dataArray;
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
