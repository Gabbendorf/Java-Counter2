import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class PlusOneButton {

    private final Button button;

    public PlusOneButton(Button button) {
        this.button = button;
        this.button.setText("+1");
    }

    public PlusOneButton() {
        this(new Button());
    }

    public void setOnAction(EventHandler<ActionEvent> value) {
        button.setOnAction(value);
    }

    public Button actualButton() {
        return button;
    }
}
