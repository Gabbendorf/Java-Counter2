import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonSpy implements ButtonWrapper {

    public boolean wasCalled = false;
    private EventHandler eventHandler;

    @Override
    public void setOnAction(EventHandler event) {
        eventHandler = event;
        wasCalled = true;
    }

    @Override
    public Button actualButton() {
        return null;
    }

    public void press() {
        eventHandler.handle(null);
    }
}
