package org.example;
public class Invoice {
        private static final int costPT=1;
        private static final double MinCPKM=10;
        private static final double MinFare=5;
        public double calculateFare(double distance,int time){
            double totalFare = distance+MinCPKM+time+costPT;
            if(totalFare<MinFare)
                return MinFare;
            return totalFare;
        }
        public double calculateFare(Ride[] rides){
            return 0;
        }
    }
