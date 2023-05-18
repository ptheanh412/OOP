/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;



public class Main {

 
    public static void main(String[] args) {
        Order o = new Order(1,LocalDate.now());
        System.out.println("Ma HD: " + o.getOrderID());
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s = o.getOrderdate().format(d);
        System.out.println("Ngay lap hoa don: " +o.getOrderdate().format(d));
        Product p = new Product ("Nuoc tuong", "sp4", 8000);
        OrderDetail od = new OrderDetail(p, 10);
        Product p1 = new Product ("Gao", "sp1", 18000);
        OrderDetail od1 = new OrderDetail(p1, 5);
        Product p2 = new Product ("Duong", "sp3", 10000);
        OrderDetail od2 = new OrderDetail(p2, 1);
        Product p3 = new Product ("Gao", "sp1", 18000);
        OrderDetail od3 = new OrderDetail(p3, 1);
        Product p4 = new Product("mi goi", "sp2", 3500);
        OrderDetail od4 = new OrderDetail(p4, 2);
        Product p5 = new Product("Nuoc suoi", "sp4", 7000);
        OrderDetail od5 = new OrderDetail(p4, 2);
        Product p6 = new Product("Muoi", "sp5", 6000);
        OrderDetail od6 = new OrderDetail(p4, 2);
        o.lineItems = new ArrayList<>();
        o.addLineItem(p, od.getQuatity());
        o.addLineItem(p1, od1.getQuatity());
        o.addLineItem(p2, od2.getQuatity());
        o.addLineItem(p3, od3.getQuatity());
        o.addLineItem(p4, od4.getQuatity());
        o.addLineItem(p5, od5.getQuatity());
        o.addLineItem(p6,od6.getQuatity());



        
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
