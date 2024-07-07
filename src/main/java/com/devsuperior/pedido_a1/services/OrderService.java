package com.devsuperior.pedido_a1.services;

import com.devsuperior.pedido_a1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double valorDesconto = (100 - order.getDiscount()) / 100;
        return order.getBase() * valorDesconto + shippingService.shippiment(order);
    }
}
