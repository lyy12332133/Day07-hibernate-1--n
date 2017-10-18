package com.lanou.domain;

import java.util.Date;

/**
 * Created by dllo on 17/10/18.
 * 订单
 */
public class Order {
    private int id; //主键
    private String orderNumber; // 订单编号
    private float price; // 订单价格
    private Date startDate; // 订单开始时间
    private Customer customer; // 该订单所属用户


    public Order(String orderNumber, float price, Date startDate) {
        this.orderNumber = orderNumber;
        this.price = price;
        this.startDate = startDate;
    }

    public Order(int id, String orderNumber, float price, Date startDate) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.price = price;
        this.startDate = startDate;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                ", customer=" + customer +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
