import javafx.scene.control.Label;

public class AppLabel {

    private final Label label;

    public AppLabel(Label label) {
        this.label = label;
    }

    public void setText(String text) {
        label.setText(text);
    }

    public Label actualLabel() {
        return label;
    }
}
