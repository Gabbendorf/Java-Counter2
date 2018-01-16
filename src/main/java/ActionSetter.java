public class ActionSetter {

    private final Counter counter;

    public ActionSetter(Counter counter) {
        this.counter = counter;
    }

    public void addClickHandler(PlusOneButton button) {
        button.setOnAction(event -> counter.updateValue());
    }
}
