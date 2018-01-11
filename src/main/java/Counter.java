public class Counter {

    private final CounterLabel label;
    private int value;

    public Counter(CounterLabel label) {
        this.label = label;
    }

    public void updateValue() {
        value += 1;
        label.setText(Integer.toString(value));
    }
}
