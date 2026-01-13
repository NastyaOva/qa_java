import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Predator predator;

    @Test
    public void getFoodTestForCat() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(predator);
        List<String> catFood = cat.getFood();
        assertEquals("Список неверный", List.of("Животные", "Птицы", "Рыба"), catFood);
        Mockito.verify(predator).eatMeat();
    }

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(null);
        String catSound = cat.getSound();
        assertEquals("Кошка издает не такой звук!", "Мяу", catSound);
    }
}
