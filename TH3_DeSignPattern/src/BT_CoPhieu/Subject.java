package BT_CoPhieu;

public interface Subject {
	void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
