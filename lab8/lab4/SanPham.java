/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1lab4;

import java.util.Scanner;

public class SanPham {
   private String tenSp;
   private double donGia;
   private double giamGia;
    
    private double getThueNhapKhau(double donGia){
        return 0.1*donGia;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
    }
    public SanPham(){
        
    }
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public void nhap(){
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = n.nextLine ();
        System.out.print("Nhap don gia: ");
        donGia = n.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = n.nextDouble();
    }
    public void xuat(){
        System.out.println("San pham vua nhap {"+ "Ten san pham: " + tenSp + ", Don gia: " + donGia + ", Giam gia: " + giamGia + ", Thue nhap khau: " + getThueNhapKhau(donGia) +'}');
    }
}
