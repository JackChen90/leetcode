package indi.jackie.leetcode.struct;

public class DiscountPrices2288 {

    private static final String Pattern = "\\$\\d+(.\\d{2})?(?=$|^\\W)";

    public String discountPrices(String sentence, int discount) {
        String[] data = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String item : data) {
            if (item.matches(Pattern)) {
                String price = item.substring(1);
                double discountPrice = Double.parseDouble(price) * (1 - discount / 100.0);
                sb.append("$").append(String.format("%.2f", discountPrice)).append(" ");
            } else {
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
