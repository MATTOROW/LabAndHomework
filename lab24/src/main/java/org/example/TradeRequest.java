package org.example;

import java.math.BigDecimal;

public class TradeRequest {
    private int amount;
    private BigDecimal total;
    private static int validScale = 2;

    private TradeRequest(int amount, BigDecimal total) {
        this.amount = amount;
        this.total = total;
    }

    public static TradeRequest registerTrade(int amount, BigDecimal total) throws InvalidAmountException, InvalidTotalException, InvalidTotalScaleException {
        if (total.compareTo(BigDecimal.valueOf(0)) <= 0) {
            throw new InvalidTotalException();
        }
        if (amount <= 0) {
            throw new InvalidAmountException();
        }
        if (total.scale() > validScale) {
            throw new InvalidTotalScaleException(total.scale(), validScale);
        }
        System.out.printf("Trade registered with total price = %s for amount = %d\n", total.toString(), amount);
        return new TradeRequest(amount, total);
    }

    public int getAmount() {
        return amount;
    }

    public BigDecimal getTotal() {
        return total;
    }


}
