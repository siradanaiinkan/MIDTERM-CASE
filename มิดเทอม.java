package QuizOneJunit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJunitTest {

    private QuizOneJunit obj;

    @Before
    public void setUp() {
        obj = new QuizOneJunit();
    }

    @Test
    public void testCountLetterA1() {
        assertEquals(2, obj.countLetterA("sasdas"));
    }
    @Test
    public void testCountLetterA23() {
        assertEquals(0, obj.countLetterA("hosix"));
        assertEquals(0, obj.countLetterA(""));
    }

    @Test
    public void testCheckTwoLetter() {
        assertFalse(obj.checkTwoLetter("A"));
        assertTrue(obj.checkTwoLetter("KO"));
        assertFalse(obj.checkTwoLetter("noxc"));
    }
} 
