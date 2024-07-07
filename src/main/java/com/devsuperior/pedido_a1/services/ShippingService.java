package com.devsuperior.pedido_a1.services;

import com.devsuperior.pedido_a1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shippiment(Order order){
        double valor = 0.0;
        if(order.getBase() < 100.0){
            valor = 20.00;
        } else if (order.getBase() >= 100.00 && order.getBase() < 200.00) {
            valor = 12.00;
        } else {
            valor = 0.0;
        }

        return valor;
    }
}
