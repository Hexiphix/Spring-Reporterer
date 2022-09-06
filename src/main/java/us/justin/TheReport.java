package us.justin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.justin.iface.SalesInput;
import us.justin.iface.SalesReport;
import us.justin.iface.ShippingPolicy;
import us.justin.impl.FileInput;

import java.util.List;

@Component
public class TheReport {
    private SalesInput in;
    private SalesReport report;
    private ShippingPolicy policy;

    @Autowired
    public TheReport(SalesInput in, SalesReport report, ShippingPolicy policy)
    {
        this.in = in;
        this.report = report;
        this.policy = policy;
        System.out.println("Report Ready to Create");
    }

    public void run() {
        System.out.println("Report is running");
        List<Sale> sales = in.getSales();
        report.generateReport(sales, policy);
    }
}
