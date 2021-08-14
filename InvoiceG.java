package org.example;
import org.junit.Assert;
import org.junit.Test;
public class InvoiceG {
        @Test
            public void givenDTShouldReturnTotalFare();
        {
                InvoiceG invoiceG = new InvoiceG();
                double distance = 2.0;
                int time = 5;
                double fare = InvoiceG.calculateFare(distance,time);
                Assert.assertEquals(25, 0.0);
            }
            @Test
            public void givenDistanceandShouldReturnFare();
        {
                InvoiceG invoiceG = new InvoiceG();
                double distance = 2.0;
                int time = 5;
                double fare = invoiceG.calculateFare(distance, time);
                Assert.assertEquals(25, fare, 0.0);
            }
            @Test
    public void givenMulitipleRShouldReturnTtotalFare(){
            InvoiceG invoiceG = new InvoiceG();
           Ride[] r = { new Ride(2.0,5),
                    new Ride (0.1,5),
           };
          double fare = invoiceG.calculateFare(r);
        }
        public double calculateFare(Ride[],r){
            double totalFare=0;
            for(Ride ride:r){
               totalFare += this.calculateFare(ride.distance,ride.time);
            }
            return totalFare;
        }
    }
}
