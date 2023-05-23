/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author 84974
 */
public class main {
    public static void main(String[] args){
        QuanLy q = new QuanLy();
        HoaDon h;
        Scanner sc = new Scanner (System.in);
        int luachon = 0;
        do{
            q.menu();
            System.out.println("\nNhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                System.out.println("1. Them hoa don khachVN\n"+
                        "2. Them hoa don Khach nuoc ngoai\n"+
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i ==1){
                    h = new KhachVN();
                    q.them((h));
                }else if ( i==2){
                    h = new KhachNuocNgoai();
                    q.them(h);
                }
            }else if (luachon == 2){
                q.xuat();
            }else if (luachon ==3 ){
                System.out.println("Nhap KH can dem: ");
                sc.nextLine();
                String loai = sc.nextLine();
                q.tongSoLuong();
            }else if(luachon ==4){
                System.out.println("TOng thanh tien: " + q.tinhTB());
            }else if (luachon ==5)
            {
                q.xuatGDngayHientai();
            }}while (luachon != 0);
    }
        
 }

