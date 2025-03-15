package BT_DuAn;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String taskName;
    private String status;

    public Task(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(taskName, status);
        }
    }
}