/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 84974
 */
public class KhachNuocNgoai extends HoaDon {
    private String quocTich;

    public KhachNuocNgoai(String quocTich, String maKH, String hoTen, double soLuong, double donGia, LocalDate ngayRaHD) {
        super(maKH, hoTen, soLuong, donGia, ngayRaHD);
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai() {
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return super.toString() + "Quoc tich: " + quocTich;
    }
    @Override
    public double thanhTien(){
        return getSoLuong() * getDonGia();
    }
    
    @Override 
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap quoc tich: ");
        this.quocTich = sc.nextLine();
        
        
    }
}
