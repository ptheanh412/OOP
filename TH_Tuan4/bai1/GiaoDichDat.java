/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.time.LocalDate;

import java.util.Scanner;


public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    private double thanhTien;

    public GiaoDichDat(String loaiDat, String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        super();
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public GiaoDichDat(){
        
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    @Override
    public double thanhTien(){
        if ( this.loaiDat == "A"){
            return getDienTich()*getDonGia()* 1.5;
        }else{
            return getDienTich() * getDonGia();
        }
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap loai dat (A/B/C): ");
        loaiDat = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLoai dat: " + loaiDat;
    }

    
    
}
