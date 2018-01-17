public class ActionSetter {

    private final Counter counter;

    public ActionSetter(Counter counter) {
        this.counter = counter;
    }

    public void addClickHandler(ButtonWrapper button) {
        button.setOnAction(event -> counter.updateValue());
    }
}
