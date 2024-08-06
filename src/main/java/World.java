import java.util.List;

public class World {

    List<Listener> listeners;

    void addListener(Listener item) {
        listeners.add(item);
    }

    void doAction(Action goal,Object obj) {
        setState("i received");
        goal.doAction(obj);
        setState("i finished");
    }

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}


