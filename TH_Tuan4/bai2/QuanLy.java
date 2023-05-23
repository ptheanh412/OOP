/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<HoaDon>list;

    public QuanLy() {
        list = new ArrayList<HoaDon>();
    }
    public void them(HoaDon h){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Lan nhap thu" +i+": ");
            if (h instanceof KhachVN){
                h = new KhachVN();
                h.nhap();
            }else if (h instanceof KhachNuocNgoai){
                h = new KhachNuocNgoai();
                h.nhap();
            }
            list.add(h);
        }
    }
    public void xuat(){
        for (HoaDon h: list){
            System.out.println(h.toString());
            System.out.println("Thanh tien: " +h.thanhTien());
        }
    }
    
    public int tongSoLuong(){
        int tong = 0;
        for (HoaDon hd: list){
            if (hd instanceof KhachVN){
                tong ++;
            }else if (hd instanceof KhachNuocNgoai){
                tong ++;
            }
        }
        return tong;
    }
    public double tinhTB(){
        double tongThanhTien = 0;
        int dem = 0;
        for(HoaDon h : list){
            if (h instanceof KhachNuocNgoai){
                tongThanhTien += h.thanhTien();
                dem++;
            }
        }
        if(dem != 0){
            return tongThanhTien/dem;
        }else {
            return 0;
        }
    }
    public void xuatGDngayHientai(){
        for (HoaDon h : list){
            if(h.getNgayRaHD().equals(LocalDate.now())){
                System.out.println(h.toString());
                System.out.println("Thanh tien: "+ h.thanhTien());
            }
        }
    }
    public void menu(){
        System.out.println("------------Menu-----------\n");
        System.out.printf("1. Nhap hoa don KH\n"+
                "2. Xuat hoa don\n"+
                "3. Tong so luong tung loai\n"+
                "4. Tinh trung binh\n"+
                "5. Xuat cac giao dich ngay 23/5");
    }
    
}
