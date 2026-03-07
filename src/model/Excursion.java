package model;

import java.math.BigDecimal;
import java.time.Duration;

public class Excursion extends TourService{
    private String guidName;
    private Duration duration;
    private Difficulty difficulty;

    @Override
    public BigDecimal calculateTotalPrice(int participants) {
        // TODO сделать скидку 10%, если количество участников больше 10
        return getPrice()
                .multiply(BigDecimal.valueOf(participants))
                .multiply(difficulty.getMultiplier());
    }
}
// TODO СДЕЛАТЬЬ АККАУНТ НА GiTHUB