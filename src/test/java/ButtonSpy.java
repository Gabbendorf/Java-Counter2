import javafx.event.EventHandler;

public class ButtonSpy extends AppButton {

    public boolean wasCalled = false;

    public void setOnAction(EventHandler event) {
        wasCalled = true;
    }
}
