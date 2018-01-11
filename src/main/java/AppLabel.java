import javafx.scene.control.Label;

public class AppLabel implements CounterLabel {

    private final Label label;

    public AppLabel() {
        this.label = new Label();
    }

    public void setText(String text) {
        label.setText(text);
    }

    public Label actualLabel() {
        return label;
    }
}
