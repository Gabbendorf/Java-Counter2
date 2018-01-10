public class LabelDouble extends AppLabel {

    private String text;

    @Override
    public void setText(String someText) {
        text = someText;
    }

    public String updatedText() {
        return text;
    }
}
