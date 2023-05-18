/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

 
    public static void main(String[] args) {
        Order o = new Order(1,LocalDate.now());
        System.out.println("Ma HD: " + o.getOrderID());
        System.out.println("Ngay lap hoa don: " +o.getOrderdate());
        Product p = new Product ("Nuoc tuong", "sp4", 8000);
        OrderDetail od = new OrderDetail(p, 10);
        Product p1 = new Product ("Gao", "sp1", 18000);
        OrderDetail od1 = new OrderDetail(p1, 5);
        Product p2 = new Product ("Duong", "sp3", 10000);
        OrderDetail od2 = new OrderDetail(p2, 1);
        Product p3 = new Product ("Gao", "sp1", 18000);
        OrderDetail od3 = new OrderDetail(p3, 1);
        o.lineItems = new ArrayList<>();
        o.addLineItem(p, od.getQuatity());
        o.addLineItem(p1, od1.getQuatity());
        o.addLineItem(p2, od2.getQuatity());
        o.addLineItem(p3, od3.getQuatity());



        
        System.out.format("%-5s %-10s %-15s %-15s %-15s %-15s\n",
                "STT ",
                "|Ma SP",
                "|Mo ta",
                "|Don gia",
                "|So luong",
                "|Thanh tien");
        for ( OrderDetail or: o.getLineItems()){
            System.out.format("%-5s %-10s %-15s %-15s %-15s %-15s\n",
                    o.getLineItems().indexOf(or)+1,
                     "|"+or.getProduct().getProductID(),
                     "|"+or.getProduct().getDescription(),
                     "|"+or.getProduct().getPrice(),
                     "|"+or.getQuatity(),
                     "|"+or.calcTotalPrice()+"VND");
        }
        
        System.out.println("Tong tien thanh toan: " + o.calcTotalCharge());
    }
    
}
