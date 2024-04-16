package ca.uwaterloo.cs446;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void sendNotice() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public abstract int getState();

    public abstract void setState(int state);

}
