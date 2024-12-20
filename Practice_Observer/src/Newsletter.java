import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    private String title;
    private String latestIssue;
    private String status;
    private List<Observer> observers;

    public Newsletter(String title, String latestIssue, String status) {
        this.title = title;
        this.latestIssue = latestIssue;
        this.status = status;
        this.observers = new ArrayList<>();
    }

    // Subject interface methods
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(this, message);
        }
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getLatestIssue() {
        return latestIssue;
    }

    public String getStatus() {
        return status;
    }

    // Setters that trigger updates
    public void setTitle(String title) {
        this.title = title;
        notifyObservers("Newsletter title changed to: " + title);
    }

    public void setLatestIssue(String latestIssue) {
        this.latestIssue = latestIssue;
        notifyObservers("New issue released: " + latestIssue);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers("Newsletter status updated to: " + status);
    }
}
