import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ActionSetterTest {

    @Test
    public void setsActionOnButton() {
        ButtonSpy buttonSpy = new ButtonSpy();
        ActionSetter actionSetter = new ActionSetter(new Counter(new LabelDouble()));

        actionSetter.addClickHandler(buttonSpy);

        assertTrue(buttonSpy.wasCalled);
    }

    @Test
    public void updatesLabelWhenButtonIsPressed() {
        ButtonSpy buttonSpy = new ButtonSpy();
        CounterLabel label = new LabelDouble();
        ActionSetter actionSetter = new ActionSetter(new Counter(label));

        actionSetter.addClickHandler(buttonSpy);
        buttonSpy.press();
        buttonSpy.press();

        assertEquals(label.getText(), "2");
    }
}