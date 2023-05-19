/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.time.LocalDate;

import java.util.Scanner;

public class HangSanhSu extends HangHoa {
    private String nhaSX;
    private LocalDate ngayNhapKho;

    public HangSanhSu(String nhaSX, LocalDate ngayNhapKho) {
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public HangSanhSu(){
        
    }

    public HangSanhSu(String nhaSX, LocalDate ngayNhapKho, String maHang, String tenHang, int soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    @Override
    public void tienVAT(){
        double vat = donGia + (donGia * 0.1);
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ngay nhap kho: ");
        int ngay = 0;
        do{
            ngay = sc.nextInt();
            if (ngay < 0 || ngay > 31){
                System.out.println("Nhap lai!!!");
            }
        }while (ngay < 0 || ngay > 31);
       
        System.out.println("Nhap thang nhap kho: ");
        int thang =0;
        do{
            thang = sc.nextInt();
            if (thang < 0 || thang > 12){
                System.out.println("Nhap lai!!!");
            }
        }while (ngay < 0 || ngay > 12);
        System.out.println("Nhap nam nhap kho: ");
        int nam =0;
        do{
            nam = sc.nextInt();
            if (nam < 0 || nam > 2023){
                System.out.println("Nhap lai!!!");
            }
        }while (nam < 0 || nam > 2023);
        ngayNhapKho = LocalDate.of(nam,thang,ngay);
    }
    @Override
    public void danhGia(){
        if (getSoLuongTon()> 50 && ngayNhapKho.isBefore(ngayNhapKho.plusDays(10))==true){
            System.out.println("Ban cham");
        }
    }
    
    
}
