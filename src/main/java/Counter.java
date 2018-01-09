import javafx.scene.control.Label;

public class Counter {

    private final Label label;
    private int startingValue = 0;

    public Counter(Label label) {
        this.label = label;
    }

    public void updateValue() {
        startingValue += 1;
        label.setText(Integer.toString(startingValue));
    }
}
