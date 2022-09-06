package us.justin.impl;

import us.justin.Sale;
import us.justin.iface.SalesReport;
import us.justin.iface.ShippingPolicy;

import java.util.List;

public class DetailSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList, ShippingPolicy policy) {
        System.out.println("\nSALES DETAIL REPORT");
        System.out.println("Customer                      Country             Amount    Tax       Shipping");
        for (Sale sale : salesList) {
            System.out.print(String.format("%-30s",sale.getName()));
            System.out.print(String.format("%-20s",sale.getCountry()));
            System.out.print(String.format("%-10.2f",sale.getCost()));
            System.out.print(String.format("%-10.2f",sale.getTax()));
            System.out.println(String.format("%.2f",policy.applyShipping(sale)));
        }
    }
}
