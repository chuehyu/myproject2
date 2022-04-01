package chuehyu;

public class GoldenCustomer extends Customer {
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
        float off = 0.2f;
    }
}