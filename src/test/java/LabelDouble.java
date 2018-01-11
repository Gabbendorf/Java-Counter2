public class LabelDouble implements CounterLabel {

    private String text;

    @Override
    public void setText(String someText) {
        text = someText;
    }

    public String updatedText() {
        return text;
    }
}
