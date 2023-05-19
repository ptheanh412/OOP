/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.time.LocalDate;
import java.util.Scanner;


public class HangThucPham extends HangHoa{
    private LocalDate ngaySX, ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(LocalDate ngaySX, LocalDate ngayHetHan, String nhaCungCap) {
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
    public HangThucPham(){
        
    }

    public HangThucPham(LocalDate ngaySX, LocalDate ngayHetHan, String nhaCungCap, String maHang, String tenHang, int soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
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

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    public boolean hetHan(){
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }

    
    @Override
    public void tienVAT(){
        double vat = donGia + (donGia * 0.05);
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ngay sx: ");
        int ngay = 0;
        do{
            ngay = sc.nextInt();
            if (ngay < 0 || ngay > 31){
                System.out.println("Nhap lai!!!");
            }
        }while (ngay < 0 || ngay > 31);
       
        System.out.println("Nhap thang sx: ");
        int thang =0;
        do{
            thang = sc.nextInt();
            if (thang < 0 || thang > 12){
                System.out.println("Nhap lai!!!");
            }
        }while (ngay < 0 || ngay > 12);
        System.out.println("Nhap nam sx: ");
        int nam =0;
        do{
            nam = sc.nextInt();
            if (nam < 0 || nam > 2023){
                System.out.println("Nhap lai!!!");
            }
        }while (nam < 0 || nam > 2023);
        
        
        do {
            System.out.println("Nhap ngay het han: ");
            int ngayhh = 0;
            do {
                ngayhh = sc.nextInt();
                if(ngayhh < 0 || ngayhh > 31){
                    System.out.println("Nhap lai!!!");
                }
            }while (ngayhh < 0 || ngayhh > 31);
                    System.out.println("Nhap lai!!!");
            int thanghh = 0;
            do {
                thanghh = sc.nextInt();
                if(thanghh < 0 || thanghh > 12){
                    System.out.println("Nhap lai!!!");
                }
            }while (thanghh < 0 || thanghh > 12);
            System.out.println("Nhap nam het han: ");
            int namhh = 0;
            do {
                nam = sc.nextInt();
                if(namhh < 0 || namhh > 2023){
                    System.out.println("Nhap lai!!!");
               }
           }while (namhh < 0 || namhh > 2023);
           ngayHetHan = LocalDate.of(nam,thang,ngay);
           if(ngayHetHan.isBefore(ngaySX)){
                System.out.println("Nhap lai!!!");
           }
           }while (ngayHetHan.isBefore(ngaySX));
    }
    @Override
    public void danhGia(){
        if(getSoLuongTon() > 0 && hetHan()){
        System.out.println("Hang kho ban");
        }
    }
}
    
    

