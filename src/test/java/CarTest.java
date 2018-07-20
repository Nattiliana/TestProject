import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CarTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testIfCarIsACar() {
        assertTrue(myFerrari instanceof Car);
    }

    @Test
    public void testStubbing() {
        assertFalse("new test double should return false as boolean",
                myFerrari.needsFuel());
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue("after instructed test double should return what we want",
                myFerrari.needsFuel());
    }

    @Test(expected = RuntimeException.class)
    public void throwException() {
        when(myFerrari.needsFuel())
                .thenThrow(new RuntimeException());
        myFerrari.needsFuel();
    }

    @Test
    public void testVerification() {
        myFerrari.driveTo("Sweet home Alabama");
        myFerrari.needsFuel();
        verify(myFerrari).driveTo("Sweet home Alabama");
        verify(myFerrari).needsFuel();
    }
}