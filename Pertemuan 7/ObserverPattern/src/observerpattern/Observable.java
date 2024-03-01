package observerpattern;

/**
 *
 * @author U53R
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

