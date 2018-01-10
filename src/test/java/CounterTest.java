import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CounterTest {

    @Before
    public void initToolkit() {
        com.sun.javafx.application.PlatformImpl.startup(() -> {
        });
    }

    @Test
    public void incrementsValue() {
        Counter counter = new Counter(new LabelDouble());

        counter.updateValue();

        assertEquals(1, counter.getValue());
    }
}
