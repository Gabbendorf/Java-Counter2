public class Counter {

    private final AppLabel label;
    private int value;

    public Counter(AppLabel label) {
        this.label = label;
    }

    public void updateValue() {
        value += 1;
        label.setText(Integer.toString(value));
    }

    public int getValue() {
        return value;
    }
}
