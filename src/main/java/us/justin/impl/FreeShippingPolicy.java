package us.justin.impl;

import us.justin.Sale;
import us.justin.iface.ShippingPolicy;

public class FreeShippingPolicy implements ShippingPolicy {
    @Override
    public double applyShipping(Sale sale) {
        return 0.00;
    }
}
