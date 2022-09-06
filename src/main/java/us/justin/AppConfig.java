package us.justin;

import us.justin.iface.*;
import us.justin.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("us.justin")
public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport(){
        //return new DetailSalesReport();
        return new SummarySalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        //return new FreeShippingPolicy();
        return new FlatRateDomesticShippingPolicy();
    }
}
