/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;

/**
 *
 * @author 84974
 */
public class Main {
    public static void main(String[] args){
        QuanLy a = new QuanLy();
        CD cd = new CD();
        Scanner sc = new Scanner (System.in);
        int luachon =0;
        do{
            a.Menu();
            System.out.println("Nhap lua chon: ");
            luachon = sc.nextInt();
            if ( luachon == 1){
                cd = new CD();
                a.them(cd);
        }else if (luachon ==2){
                a.tinhSL();
        }else if(luachon==3){
                a.xuatDS();
        }else if (luachon ==4){
                a.tinhTongGia();
        }else if (luachon==5){
                a.sapXepGiaThanh();
        }else if ( luachon ==6){
                a.sapXepTuaCD();
        }
        }while (luachon != 7 );
    }
 }

