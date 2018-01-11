import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ActionSetterTest {

    @Before
    public void initToolkit() {
        com.sun.javafx.application.PlatformImpl.startup(() -> {});
    }

    @Test
    public void setsActionOnButton() {
        ButtonSpy buttonSpy = new ButtonSpy();
        ActionSetter actionSetter = new ActionSetter(new Counter(new LabelDouble()));
        actionSetter.addClickHandler(buttonSpy);
        assertTrue(buttonSpy.wasCalled);
    }
}