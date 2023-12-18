import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {

    private QuizOneJunit obj;

    @Before
    public void setUp() {
        obj = new QuizOneJunit();
    }

    @Test
    public void testCountLetterA() {
        assertEquals(2, obj.countLetterA("sasdas"));
        assertEquals(0, obj.countLetterA("hosix"));
        assertEquals(0, obj.countLetterA(""));
    }

    @Test
    public void testCheckTwoLetter() {
        assertTrue(obj.checkTwoLetter("A"));
        assertTrue(obj.checkTwoLetter("KO"));
        assertTrue(obj.checkTwoLetter("noxc"));
    }
}
