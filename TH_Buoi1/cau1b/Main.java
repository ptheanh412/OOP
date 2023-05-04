/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HangThucPham tp = new HangThucPham();
        QuanLy t = new QuanLy();
        Scanner sc = new Scanner ( System.in);
        int luaChon = 0;
        do{
            t.menu();
            System.out.println("Nhap lua chon: ");
            luaChon = sc.nextInt();
            if ( luaChon == 1){
                tp = new HangThucPham();
                t.them(tp);
        }else if (luaChon ==2){
                t.xuatDS();
        }
        }while (luaChon != 3);
    }       
}

