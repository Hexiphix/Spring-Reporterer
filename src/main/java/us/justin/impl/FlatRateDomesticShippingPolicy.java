package us.justin.impl;

import us.justin.Sale;
import us.justin.iface.ShippingPolicy;

public class FlatRateDomesticShippingPolicy implements ShippingPolicy {
    @Override
    public double applyShipping(Sale sale) {
        return sale.getCountry().equals("United States") ? 5.99
                : sale.getCountry().equals("Scotland") ? 7.54
                : sale.getCountry().equals("India") ? 11.79
                : sale.getCountry().equals("Japan") ? 14.50
                : 0.00;
    }
}
