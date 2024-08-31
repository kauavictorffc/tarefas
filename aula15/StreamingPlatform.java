import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamingPlatform implements Observable {
    private Map<String, List<Observer>> observersByGenre;

    public StreamingPlatform() {
        observersByGenre = new HashMap<>();
    }

    @Override
    public void registerObserver(Observer observer, String genre) {
        observersByGenre.putIfAbsent(genre, new ArrayList<>());
        observersByGenre.get(genre).add(observer);
    }

    @Override
    public void removeObserver(Observer observer, String genre) {
        List<Observer> observers = observersByGenre.get(genre);
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(String genre, String content) {
        List<Observer> observers = observersByGenre.get(genre);
        if (observers != null) {
            for (Observer observer : observers) {
                observer.update(genre, content);
            }
        }
    }

    public void addNewContent(String genre, String content) {
        System.out.println("New " + genre + " content added: " + content);
        notifyObservers(genre, content);
    }
}
