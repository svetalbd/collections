package com.goit.ee.collections;

/**
 * Created by Сергей on 25.05.2016.
 */
public abstract class TimerCollection {
    public long timerAdd;
    public long timerGet;
    public long timerRemove;
    public long timerContains;
    public long timerPopulate;
    public long timerIteratorAdd;
    public long timerIteratorRemove;

    abstract public long populate (int i);
    abstract public long add (int i);
    abstract public long get (int i);
    abstract public long remove (int i);
    abstract public long contains (int i);
    abstract public long iteratorAdd (int i);
    abstract public long iteratorRemove ();
    abstract public void clear();
}
