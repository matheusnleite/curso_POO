package util;

public class CurrencyConverter {
    public static double dollarToReal(double dollarPrice, double dollarBought) {
        return dollarPrice * dollarBought * 1.06;
    }
}
