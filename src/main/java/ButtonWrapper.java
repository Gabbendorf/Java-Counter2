import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public interface ButtonWrapper {

    void setOnAction(EventHandler<ActionEvent> value);

    Button actualButton();
}
