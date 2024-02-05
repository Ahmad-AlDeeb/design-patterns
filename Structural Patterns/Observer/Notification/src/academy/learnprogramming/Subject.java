package academy.learnprogramming;
import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers(String message);
}

class MyTopic implements Subject {
    private List<Observer> observers;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }
    public void register(Observer obj) {
        observers.add(obj);
    }
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    public void notifyObservers(String message) {
        for (Observer obj : observers) {
            obj.update(message);
        }
    }


    //method to post message to the topic, change state (trigger notifications)
    public void postMessage(String message) {
        System.out.println("Message Posted to Topic:" + message);
        this.changed = true;
        notifyObservers(message);
    }
}