import com.example.Lion;
import com.example.Predator;
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
    Predator predator;

    @Test
    public void getFoodTestForLion() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(predator);
        List<String> lionFood = lion.getFood();
        assertEquals("Список неверный", List.of("Животные", "Птицы", "Рыба"), lionFood);
        Mockito.verify(predator).eatMeat();
    }

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(predator.getOffspring()).thenReturn(1);
        Lion lion = new Lion(predator);
        int countKittens = lion.getKittens();
        assertEquals("Количество котят неверное", 1, countKittens);
        Mockito.verify(predator).getOffspring();
    }
}
