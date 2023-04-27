/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau1a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuanLy q = new QuanLy();
        Vehicle x = new Vehicle();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do{
            q.Menu();
            System.out.println("Nhap lua chon: ");
            luaChon = sc.nextInt();
            if ( luaChon == 1){
                x = new Vehicle();
                q.them(x);
        }else if (luaChon ==2){
                q.xuatDs();
        }
        }while (luaChon != 3);
    }
    
}
