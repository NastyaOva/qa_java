import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionManeErrorTest {
    @Test
    public void throwsException() {
        Exception exception = null;
        try {
            new Lion("Неизвестно", null);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull("Исключение не выброшено", exception);
    }

    @Test
    public void throwsExceptionCorrectMessage() {
        Exception exception = null;
        try {
            new Lion("Неизвестно", null);
        } catch (Exception e) {
            exception = e;
        }
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
