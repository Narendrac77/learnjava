package com.narendra.docker.test;

import java.util.Date;

public class Order {

    private int orderID;
    private Date OrderDate;

    public Order(int orderID, Date orderDate) {
        this.orderID = orderID;
        OrderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }
}
