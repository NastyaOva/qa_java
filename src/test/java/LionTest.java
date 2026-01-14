import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodTestForLion() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        List<String> lionFood = lion.getFood();
        assertEquals("Список неверный", List.of("Животные", "Птицы", "Рыба"), lionFood);
    }

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка", feline);
        int kittens = lion.getKittens();
        assertEquals("Количество котят неверное", 1, kittens);
    }
}
