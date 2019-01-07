package com.basic.observer.ducks;

import com.basic.observer.Observer;

/**
 * locate com.basic.observer
 * Created by MasterTj on 2019/1/7.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
