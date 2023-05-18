/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author 84974
 */
public class OrderDetail {
    private int quatity;
    private Product product;

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quality) {
        this.quatity = quality;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public OrderDetail(Product product, int quality) {
        this.quatity = quality;
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quality=" + quatity + ", product=" + product + '}';
    }
    
    public double calcTotalPrice(){
        return this.quatity * this.product.getPrice();
    }
    public void add(OrderDetail orderdetail){
        
    }

    
}
