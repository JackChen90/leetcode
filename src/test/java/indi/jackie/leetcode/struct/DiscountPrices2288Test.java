package indi.jackie.leetcode.struct;

import org.junit.Test;

public class DiscountPrices2288Test {

    @Test
    public void discountPrices() {
        DiscountPrices2288 discountPrices2288 = new DiscountPrices2288();
        String data = "The price of the item is $100.00";
        String ans = discountPrices2288.discountPrices(data, 50);
        assert ans.equals("The price of the item is $50.00");

        data = "The price of the item is $100.00 the price of the item is $200.00";
        ans = discountPrices2288.discountPrices(data, 100);
        assert ans.equals("The price of the item is $0.00 the price of the item is $0.00");
    }
}