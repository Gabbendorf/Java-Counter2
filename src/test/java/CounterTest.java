import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void incrementsValue() {
        LabelDouble labelDouble = new LabelDouble();
        Counter counter = new Counter(labelDouble);

        counter.updateValue();

        assertEquals("1", labelDouble.updatedText());
    }
}
