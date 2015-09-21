package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {

        Iterator<Observer> it = observers.iterator();

        while (it.hasNext()) {
            it.next().update(this);
        }

    }

    public int getStdyingTime() {
        return (int) (Math.random() * 10);
    }

    public abstract int getStatus();
    public abstract String getName();
    public abstract void run();

}
