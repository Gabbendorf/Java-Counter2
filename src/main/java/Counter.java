public class Counter {

    private final AppLabel label;
    private int startingValue = 0;

    public Counter(AppLabel label) {
        this.label = label;
    }

    public void updateValue() {
        startingValue += 1;
        label.setText(Integer.toString(startingValue));
    }
}
