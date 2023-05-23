/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        QuanLy q = new QuanLy();
        GiaoDich g = new GiaoDich();
        GiaoDichDat gd = new GiaoDichDat();
        GiaoDichNha gn = new GiaoDichNha();
        Scanner sc = new Scanner (System.in);
        int luachon = 0;
        do{
            q.menu();
            System.out.println("\nNhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                System.out.println("1. Them gd dat\n"+
                        "2. Them gd nha\n"+
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i ==1){
                    gd = new GiaoDichDat();
                    gd.nhap();
                }else if ( i==2){
                    gn = new GiaoDichNha();
                    gn.nhap();
                }
            }else if (luachon == 2){
                q.xuat();
            }else if (luachon ==3 ){
                System.out.println("Nhap loai GD:");
                sc.nextLine();
                q.tongSoLuong();
            }else if(luachon ==4){
                System.out.println("TOng thanh tien: " + q.tinhTB());
            }else if (luachon ==5)
            {
                q.xuatGDngayHientai();
            }}while (luachon != 0);
    }
}
