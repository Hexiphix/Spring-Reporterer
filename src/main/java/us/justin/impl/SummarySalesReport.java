package us.justin.impl;

import us.justin.Sale;
import us.justin.iface.SalesReport;
import us.justin.iface.ShippingPolicy;

import java.util.ArrayList;
import java.util.List;

public class SummarySalesReport implements SalesReport {
    List<String> country = new ArrayList<>();
    double[] amount;
    double[] tax;
    double[] shipping;

    @Override
    public void generateReport(List<Sale> salesList, ShippingPolicy policy) {
        country.add(salesList.get(0).getCountry());
        int countryCount = 1;
        int count = 0;
        boolean countryFound = false;

        for(Sale sales: salesList){
            countryFound = false;
            for(String countries: country){
                if(sales.getCountry().equals(countries)){
                    countryFound = true;
                    break;
                }
            }
            if(countryFound == false)
            {
                country.add(sales.getCountry());
                countryCount++;
            }
        }

        amount = new double[countryCount];
        tax = new double[countryCount];
        shipping = new double[countryCount];

        for (Sale sales : salesList){
            count = 0;
            for (String countries: country){
                if(sales.getCountry().equals(countries)){
                    amount[count] += sales.getCost();
                    tax[count] += sales.getTax();
                    shipping[count] += policy.applyShipping(sales);
                    break;
                }
                count++;
            }
        }

        System.out.println("\nSALES SUMMARY REPORT");
        System.out.println("Country             Amount    Tax       Shipping");
        for (int i = 0; i < countryCount; i++) {
            System.out.print(String.format("%-20s",country.get(i)));
            System.out.print(String.format("%-10.2f",amount[i]));
            System.out.print(String.format("%-10.2f",tax[i]));
            System.out.println(String.format("%.2f",shipping[i]));
        }
    }
}
