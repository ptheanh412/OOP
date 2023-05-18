/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author 84974
 */
public class Product {
    private String description, productID;
    private double price;

    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }
    
    public Product(){
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
    }
    
}
