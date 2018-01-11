import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void incrementsValue() {
        Counter counter = new Counter(new LabelDouble());

        counter.updateValue();

        assertEquals(1, counter.getValue());
    }
}
