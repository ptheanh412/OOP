/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1bonus;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    ArrayList<SinhVien> svs;
    public Main(){
        this.svs = new ArrayList<>();
    }
    public void them(SinhVien sv){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so luong: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i ++){
           sv = new SinhVien();
           sv.nhap();
           svs.add(sv);
        }       
    }
    public void xuatDS(){
        System.out.format("%-30s %-30s %-20s %-20s\n",
                "Ma SSV",
                "Ho va ten",
                "Dia chi",
                "SDT");
        System.out.println("========================================================================================");
        for (SinhVien sv: svs){
            System.out.format("%-30s %-30s %-20s %-20s\n",
                    sv.getMssv(),
                    sv.getHoTen(),
                    sv.getDiaChi(),
                    sv.getSDT());
    }
    }
    public void sapXep(){
        Collections.sort(this.svs, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien o1, SinhVien o2){
                    int i= (o1.getMssv() - o2.getMssv());
                    if (i <0){
                        return -1;
                    }else if (i == 0){
                        return 0;
                    }
                    return 1;
                }
        }
        );
    }
    public void menu(){
        System.out.printf("----------\n" +
                "1. Nhap thong tin\n" +
                "2. Xuat thong tin\n" +
                "3. Thoat \n");
    }    
    public static void main(String[] args){
        Main a = new Main();
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner (System.in);
        int luachon = 0;
        do{
            a.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                a.them(sv);
            }else if( luachon ==2 ) {
                a.sapXep();
                a.xuatDS();
            }
        }while(luachon != 3);
    }
    
}
