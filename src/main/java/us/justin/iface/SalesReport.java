package us.justin.iface;

import us.justin.Sale;
import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList, ShippingPolicy policy);
}
