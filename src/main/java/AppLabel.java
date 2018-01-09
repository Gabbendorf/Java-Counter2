import javafx.scene.control.Label;

public class AppLabel {

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
