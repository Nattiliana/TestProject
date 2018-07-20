import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class MainTest {

    private static final String NULL = null;

    @Parameterized.Parameter
    public Map<String, String> params;

    @Parameterized.Parameters
    public static Collection<Object[]> configs() {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "emaN");
        map.put("Color", "roloC");

        return Arrays.asList(new Object[][]{
                {map}
        });
    }

    @Test
    public void shouldReverseString() {
        Iterator<String> keysIterator = params.keySet().iterator();
        Iterator<String> valuesIterator = params.values().iterator();
        params.forEach((k, v) -> assertEquals(Main.reverse(keysIterator.next()), valuesIterator.next()));
    }

    @Test
    public void shouldNormReverseString() {
        Iterator<String> keysIterator = params.keySet().iterator();
        Iterator<String> valuesIterator = params.values().iterator();
        params.forEach((k, v) -> assertEquals(Main.normReverse(keysIterator.next()), valuesIterator.next()));
    }

@Test
    public void shouldCheatReverseString() {
        Iterator<String> keysIterator = params.keySet().iterator();
        Iterator<String> valuesIterator = params.values().iterator();
        params.forEach((k, v) -> assertEquals(Main.cheatReverse(keysIterator.next()), valuesIterator.next()));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowException() {
        Main.reverse(NULL);
    }

    @Test(expected = NullPointerException.class)
    public void shouldNormThrowException() {
        Main.normReverse(NULL);
    }
}