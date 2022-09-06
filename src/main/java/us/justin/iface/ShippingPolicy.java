package us.justin.iface;

import us.justin.Sale;

public interface ShippingPolicy {
    double applyShipping(Sale sale);
}
