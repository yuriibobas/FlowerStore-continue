package ua.edu.ucu.apps.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHLD Delivery");
        if (orderPrice > 1000) {
            return 0;
        }
        return 100;
    }
}
