import java.util.List;

public interface Observable {
    void registerObserver(Observer observer, String genre);
    void removeObserver(Observer observer, String genre);
    void notifyObservers(String genre, String content);
}
