/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1b;

import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham {
    private String maHang, tenHang;
    private double donGia;
    private LocalDate ngaySX, ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySX, LocalDate ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
    }
    public HangThucPham(){
        
    }
    
    public HangThucPham(String maHang){
        this.maHang = maHang;   
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals(""))
            this.maHang = maHang;
        else 
            throw new Exception("Loi: Ma hang rong!");
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LocalDate getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(LocalDate ngaySX) {
        this.ngaySX = ngaySX;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    public boolean hetHan(){
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }

    @Override
    public String toString() {
        return "HangThucPham{" + 
                "maHang='" + maHang + 
                ", tenHang=" + tenHang + 
                ", donGia=" + donGia + 
                ", ngaySX=" + ngaySX + 
                ", ngayHetHan=" + ngayHetHan + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ma hang:");
        maHang = sc.nextLine();
        System.out.println("Nhap ten hang:");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia:");
        do{
         donGia = sc.nextDouble();
         if (donGia < 0)
                System.out.println("Nhap lai:");
        }while ( donGia <0);
        System.out.println("Nhap ngay sx: ");
        int ngay = sc.nextInt();
        System.out.println("Nhap thang sx: ");
        int thang = sc.nextInt();
        System.out.println("Nhap nam sx: ");
        int nam = sc.nextInt();
        ngaySX = LocalDate.of(nam,thang,ngay);
        System.out.println("Nhap ngay het han: ");
        int ngayHH = sc.nextInt();
        System.out.println("Nhap thang het han: ");
        int thangHH = sc.nextInt();
        System.out.println("Nhap nam het han: ");
        int namHH = sc.nextInt();
        ngayHetHan = LocalDate.of(namHH, thangHH, ngayHH);

    }
    

}
