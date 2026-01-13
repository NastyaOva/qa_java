import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> felineFood = feline.eatMeat();
        assertEquals("Список неверный", List.of("Животные", "Птицы", "Рыба"), felineFood);
    }

    @Test
    public void getOffspringTest() {
        Feline feline = new Feline();
        int offspring = feline.getOffspring();
        assertEquals("Неверное количество", 1, offspring);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(3);
        assertEquals("Неверное количество", 3, kittens);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Неверное семейство", "Кошачьи", family);
    }
}
