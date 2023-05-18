/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.time.LocalDate;

import java.util.ArrayList;
public class Order {
    private int orderID, count;
    private LocalDate orderdate;
    ArrayList <OrderDetail> lineItems;
    public Order(){
        
    }
    
    public Order(int orderID, LocalDate orderdate){
        this.orderID = orderID;
        this.orderdate = orderdate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderdate() {
        return orderdate;
    }
    


    public void setOrderdate(LocalDate orderdate) {
        this.orderdate = orderdate;
    }
    public void addLineItem(Product p, int x){
        lineItems.add( new OrderDetail (p,x));
        count ++;
    }
    public double calcTotalCharge(){
        double total =0.0;
        for (OrderDetail o: lineItems){
           total += o.calcTotalPrice();
        }
        return total;
    }
    public ArrayList<OrderDetail> getLineItems(){
        return this.lineItems;
    }
    
    
}
