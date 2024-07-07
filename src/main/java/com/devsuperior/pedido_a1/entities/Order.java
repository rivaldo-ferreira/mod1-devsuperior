package com.devsuperior.pedido_a1.entities;

public class Order {

    private Integer order;
    private Double base;
    private Double discount;

    public Order(){}

    public Order(Integer order, Double base, Double discount) {
        this.order = order;
        this.base = base;
        this.discount = discount;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
