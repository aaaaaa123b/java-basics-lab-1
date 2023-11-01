import org.example.task9.model.Ball;
import org.example.task9.model.Basket;
import org.example.task9.service.BallService;
import org.example.task9.service.BasketService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask9 {

    @Test
    public void testForBasket(){
        final Basket basket = new Basket();

        List<Ball> balls = BallService.generate();

        basket.putBalls(balls);

        final BasketService basketService = new BasketService();

        double weight = basketService.weightBalls(balls);
        int number = basketService.numberBlue(balls);

        assertEquals(number,2);
        assertEquals(weight,12.8);
    }

}
