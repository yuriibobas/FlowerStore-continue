package ua.edu.ucu.apps.lab7.order;

import java.util.List;

import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.payment.Payment;

public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(List<Item> items) {
        this.items = items;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public double countPrice() {
        return items.stream().mapToDouble(item -> item.getPrice()).sum();
    }

    public void processOrder() {
        double totalPrice = countPrice();
        payment.pay(totalPrice);
        delivery.delivery(totalPrice);
    }
}
