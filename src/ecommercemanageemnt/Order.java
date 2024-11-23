/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercemanageemnt;

/**
 *
 * @author User
 */
import java.util.UUID;

public class Order {
    String orderId;
    Customer customer;
    Product product;

    public Order(Customer customer, Product product) {
        this.orderId = UUID.randomUUID().toString();
        this.customer = customer;
        this.product = product;
    }
}
