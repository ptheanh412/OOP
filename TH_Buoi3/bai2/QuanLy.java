/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLy {
    ArrayList<HangHoa> list;
    
    public void themHH(HangHoa h){
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i =0; i<n; i++){
            System.out.println("Lan nhap thu" +i+": ");
            if (h instanceof HangDienMay){
                h = new HangDienMay();
                h.nhap();
            }else if (h instanceof HangThucPham){
                h = new HangThucPham();
                h.nhap();
            }else if (h instanceof HangSanhSu){
                h = new HangSanhSu();
                h.nhap();
            }
            list.add(h);
        }
    }
    
    public void xuat(){
        System.out.println("----------------------------------------------------------");
        System.out.format("%-30s %-30s %-30s %-30s",
                "| Ma hang hoa",
                "| Ten hang hoa",
                "| So luong ton",
                "| Don gia");
        System.out.println("----------------------------------------------------------");
        for (HangHoa h: list){
            System.out.format("%-30s %-30s %-30s %-30s",
                    "| " + h.getMaHang(),
                    "| " + h.getTenHang(),
                    "| "+  h.getSoLuongTon(),
                    "| " + h.getDonGia());
        System.out.println("----------------------------------------------------------");
        } 
    }
    
    public void menu(){
        System.out.printf("---------MENU----------\n" +
                "1. Nhap\n"+
                "2. Xuat\n"+
                "Nhap lua chon: ");
    }
    
    
}
