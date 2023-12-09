package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int amount = 1000;
        BigDecimal total = BigDecimal.valueOf(12.52);
        try {
            TradeRequest a = TradeRequest.registerTrade(amount, total);
            System.out.println(a.getAmount());
        } catch (InvalidTotalException | InvalidTotalScaleException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }

}