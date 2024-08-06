import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



class WorldTest {
    public void testWorld(){
        World  w= mock(World.class);
        Listener listener = new Listener();
        w.addListener(listener);
    }
}

class Listener {
    void doAction() {
        return;
    }
}

