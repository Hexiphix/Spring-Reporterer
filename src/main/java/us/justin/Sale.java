package us.justin;

public class Sale {
    private String name;
    private String country;
    private double cost;
    private double tax;

    public Sale(String name, String country, double cost, double tax) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
