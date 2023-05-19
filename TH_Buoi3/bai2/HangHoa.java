/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

public abstract class HangHoa {
    private String maHang, tenHang;
    private int soLuongTon;
    double donGia;
    abstract void tienVAT();
    abstract void danhGia();
    
    public HangHoa(){
        
    }

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ma hang hoa:");
        do{
            maHang = sc.nextLine();
            if (maHang == null){
                System.out.println("Nhap lai!!!");
            }
            
        }while(maHang == null);
        System.out.println("Nhap ten hang:");
        do{
            tenHang = sc.nextLine();
            if (tenHang == null){
                System.out.println("Nhap lai!!!");
            }
            
        }while(tenHang == null);
        System.out.println("Nhap don gia");
        do{
            donGia = sc.nextInt();
            if(donGia <= 0){
                System.out.println("Nhap lai!!!");
            }
        }while (donGia <= 0);
        System.out.println("Nhap so luong ton: ");
        do{
            soLuongTon = sc.nextInt();
            if (soLuongTon < 0){
                System.out.println("Nhap lai!!!");
            }
        }while (soLuongTon < 0);
        
    }
    
}
