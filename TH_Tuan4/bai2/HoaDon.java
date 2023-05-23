/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.time.LocalDate;
import java.util.Scanner;

public class HoaDon {
    private String maKH, hoTen;
    private double soLuong, donGia;
    private LocalDate ngayRaHD;

    public HoaDon(String maKH, String hoTen, double soLuong, double donGia, LocalDate ngayRaHD) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayRaHD = ngayRaHD;
    }
    public HoaDon(){
        
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LocalDate getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(LocalDate ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "\nMaKH: " + maKH + 
                "\nHo va ten: " + hoTen + 
                "\nSo luong: " + soLuong + 
                "\nDon gia: " + donGia + 
                "\nNgay ra HD: " + ngayRaHD;
    }
    
    public double thanhTien(){
        return 0;
        
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ma KH:");
        this.maKH = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap so luong ( so KW dien tieu thu) : ");
        this.soLuong = sc.nextDouble();
        System.out.println("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        System.out.println("Nhap ngay: ");
        int ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        int thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        int nam = sc.nextInt();
        ngayRaHD = LocalDate.of(nam,thang,ngay);
    }
}
