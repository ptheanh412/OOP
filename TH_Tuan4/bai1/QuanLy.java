/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;

public class QuanLy {
    ArrayList<GiaoDich>list;
    
    public QuanLy(){
        list = new ArrayList<>();
    }
    
    public void themGD(GiaoDich g){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Lan nhap thu" +i+": ");
            if (g instanceof GiaoDichDat){
                g = new GiaoDichDat();
                g.nhap();
            }else if (g instanceof GiaoDichNha){
                g = new GiaoDichNha();
                g.nhap();
            }
            list.add(g);
        }
    }
    
    public void xuat(){
        for (GiaoDich g: list){
            System.out.println(g.toString());
            System.out.println("Thanh tien: " +g.thanhTien());
        }
    }
    
    public void tongSoLuong(){
        for (GiaoDich gd: list){
            int tong = 0;
            if (gd instanceof GiaoDichDat){
                tong ++;
                System.out.println("Tong so luong giao dich dat: " + tong);
            }else if (gd instanceof GiaoDichNha){
                tong ++;
                System.out.println("Tong so luong giao dich nha: " + tong);
            }
        }
    }
    public double tinhTB(){
        double tongThanhTien = 0;
        int dem = 0;
        for(GiaoDich gd : list){
            if (gd instanceof GiaoDichDat){
                tongThanhTien += gd.thanhTien();
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
        for (GiaoDich gd : list){
            if(gd.getNgayGD().equals(LocalDate.now())){
                System.out.println(gd.toString());
                System.out.println("Thanh tien: "+ gd.thanhTien());
            }
        }
    }
    public void menu(){
        System.out.println("------------Menu-----------\n");
        System.out.printf("1. Nhap giao dich\n"+
                "2. Xuat cac giao dich\n"+
                "3. Tong so luong tung loai\n"+
                "4. Tinh trung binh\n"+
                "5. Xuat cac giao dich ngay 23/5");
    }
}
