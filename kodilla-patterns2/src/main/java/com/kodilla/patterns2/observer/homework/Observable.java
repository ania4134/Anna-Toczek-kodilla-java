package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(TaskObserver observer);
    void notifyObservers();
    void removeObserver(TaskObserver observer);
}
