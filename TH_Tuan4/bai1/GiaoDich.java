/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class GiaoDich {
    private String maGD;
    private LocalDate ngayGD;
    private double donGia, dienTich;

    public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public GiaoDich(){
        
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ma giao dich: ");
        this.maGD = sc.nextLine();
        System.out.println("Nhap ngay GD: ");
        int ngay = sc.nextInt();
        System.out.println("Nhap thang GD: ");
        int thang = sc.nextInt();
        System.out.println("Nhap nam GD: ");
        int nam = sc.nextInt();
        ngayGD = LocalDate.of(nam,thang,ngay);
        System.out.println("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        System.out.println("Nhap dien tich: ");
        this.dienTich = sc.nextDouble(); 
    }
    public double thanhTien(){
        return 0;
    }


    @Override
    public String toString() {
        return "GiaoDich{" + "maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }


    

}
