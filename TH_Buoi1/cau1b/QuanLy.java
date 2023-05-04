/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1b;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<HangThucPham> tps;
    
    public QuanLy(){
        tps = new ArrayList<>();
    }
    
    public void them(HangThucPham tp){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so luong: ");
        int n = sc.nextInt();
        for ( int i = 0; i<n; i++){
            tp = new HangThucPham();
            tp.nhap();
            tps.add(tp);
        }
    }
    public void xuatDS(){
        System.out.format("%-20s %-20s %-30s %-30s %-30s %-30s\n",
                "Ma_Hang",
                "Ten_Hang",
                "Don_gia",
                "Ngay_San_Xuat",
                "Ngay_het_han",
                "Ghi_chu");
        System.out.println("===================================================================================================================================================================================");
        for( HangThucPham tp: tps){
            if(tp.hetHan()){
                System.out.format("%-20s %-20s %-30s %-30s %-30s %-30s\n",
                        tp.getMaHang(),
                        tp.getTenHang(),
                        tp.getDonGia()+"VND",
                        tp.getNgaySX(),
                        tp.getNgayHetHan(),
                        "Het han");
            }else {
                System.out.format("%-20s %-20s %-30s %-30s %-30s\n",
                        tp.getMaHang(),
                        tp.getTenHang(),
                        tp.getDonGia()+"VND",
                        tp.getNgaySX(),
                        tp.getNgayHetHan());
                      
            }
        }
    }
    public void menu(){
        System.out.println("-------------\n" +
                "1.Nhap thong tin\n"+
                "2.Xuat bang ke khai\n"+
                "3.Thoat");
        
    }
    
}
