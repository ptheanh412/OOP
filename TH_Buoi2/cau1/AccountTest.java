/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau1;

import java.util.Scanner;

public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountList a = new AccountList();
        Account ac = new Account();
        Scanner sc = new Scanner (System.in);
        int luachon =0;
        do{
            a.Menu();
            System.out.println("Nhap lua chon: ");
            luachon = sc.nextInt();
            if ( luachon == 1){
                ac = new Account();
                a.them(ac);
        }else if (luachon ==2){
                a.soLuongTK();
        }else if(luachon==3){
                a.xuatDS();
        }else if (luachon ==4){
                a.napTien();
        }else if (luachon==5){
                a.rutTien();
        }else if ( luachon ==6){
                a.chuyenKhoan();
        }
        }while (luachon != 7 );
    }
    
    
}
