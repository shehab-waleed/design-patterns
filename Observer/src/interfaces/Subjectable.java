package interfaces;

public interface Subjectable {
    public void registerObserver(Observable observer);
    public void removeObserver(Observable observer);
    public void notifyObservers();
}
