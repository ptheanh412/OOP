/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 84974
 */
public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi;
    private double thanhTien;

    public GiaoDichNha(String loaiNha, String diaChi, String maGD, LocalDate ngayGD, double donGia, double dienTich, double thanhTien) {
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(){
        
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public double thanhTien(){
        if ( this.loaiNha == "cao cap"){
            return getDienTich()*getDonGia();
        }else{
            return getDienTich() * getDonGia()*0.9;
        }
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap loai nha (cao cap/thuong): ");
        loaiNha = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        
        
    }

    @Override
    public String toString() {
        return super.toString()+ "loaiNha=" + loaiNha + ", diaChi=" + diaChi;
    }
    
    
    
}
