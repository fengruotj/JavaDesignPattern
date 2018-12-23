package com.basic.inter;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
