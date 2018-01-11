import javafx.scene.control.Label;

public class AppLabel implements CounterLabel {

    private final Label label;

    public AppLabel() {
        this.label = new Label();
        this.label.setText("0");
    }

    public void setText(String text) {
        label.setText(text);
    }

    public Label actualLabel() {
        return label;
    }
}
