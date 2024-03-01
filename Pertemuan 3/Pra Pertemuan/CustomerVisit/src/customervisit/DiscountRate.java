package customervisit;

/**
 *
 * @author U53R
 */
public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountSilver = 0.1;
    private static final double productDiscountGold = 0.1;

    public static double getServiceDiscountRate(String type) {
        if ("Premium".equals(type)) {
            return serviceDiscountPremium;
        }else if ("Gold".equals(type)) {
            return serviceDiscountGold;
        }else if ("Silver".equals(type)) {
            return serviceDiscountSilver;
        }else {
            return 0;
        }
    }

    public static double getProductDiscountRate(String type) {
        if ("Premium".equals(type)) {
            return productDiscountPremium;
        }else if ("Gold".equals(type)) {
            return productDiscountGold;
        }else if ("Silver".equals(type)) {
            return productDiscountSilver;
        }else {
            return 0;
        }
    }
}