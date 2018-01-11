import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class AppButton {

    private final Button button;

    public AppButton(Button button) {
        this.button = button;
        this.button.setText("+1");
    }

    public AppButton() {
        this(new Button());
    }

    public void setOnAction(EventHandler<ActionEvent> value) {
        button.setOnAction(value);
    }

    public Button actualButton() {
        return button;
    }
}
