/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountList {
    ArrayList<Account> acs;
    int count;
    
    public AccountList(){
        this.acs = new ArrayList<>(10);
        int count = 0;
    }

    public AccountList(int n) {
        if (n>0){
            acs = new ArrayList<Account>(n);
        }else {
            acs = new ArrayList<Account>(10);
            count =0;
        }
    }
    public void them(Account ac){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap sl can them: ");
        int n = 0;
        n = sc.nextInt();
        for ( int i = 0; i<n; i++){
            ac = new Account();
            ac.nhap();
            acs.add(ac);
        }
    }
    public void timTK(long stk ){
        for (int i = 0; i< count; i++){
            if ( acs.get(i).getStk()== stk){
                System.out.println(acs.get(i).getStk() == stk);
            }
        }
    }
    public void xoaTK(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Nhap stk can xoa: ");
        long stk = sc.nextLong();
        for ( int i =0; i<count; i++){
            acs.remove(i);
            count --;
            System.out.println("Da xoa thanh cong!");
        }
    }
    public void soLuongTK(){
        System.out.println("Tong so TK: " + acs.size());
    }
    public void xuatDS(){
        System.out.format("%-30s %-30s %-30s %-30s\n",
                "So tai khoan",
                "Ten tai khoan",
                "So tien",
                "Trang thai");
        
        System.out.println("==========================================================================================================================================================");
        for (Account ac: acs ){
            System.out.format("%-30s %-30s %-30s %-30s\n",
                ac.getStk(),
                ac.getTenTK(),
                ac.getSoTien(),
                ac.getTrangThai());
        }
//        for ( Account ac : acs){
//            System.out.println(ac.toString());
//        }
    }
    public void napTien(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so tai khoan can nap: ");
        long stk = sc.nextLong();
        System.out.println("Nhap so tien can nap: ");
        double soTien = sc.nextDouble();
        do{
            if (soTien <=0){
                System.out.println("Nap tien khong hop le:");
            }
        }while(soTien <=0);
        for (int i = 0; i< acs.size(); i ++){
            Account a = acs.get(i);
            if (a.getStk() == stk){
                a.setSoTien(a.getSoTien()+soTien);
                System.out.println("Da nap thanh cong!");
            }else if (a.getStk() != stk){
                System.out.println("Khong tim thay stk!");
            }
        }
    }
    public void rutTien(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so tai khoan rut tien: ");
        long stk = sc.nextLong();
        System.out.println("Nhap so tien can rut: ");
        double soTien = sc.nextDouble();
        do{
            if (soTien <=0){
                System.out.println("Rut tien khong hop le:");
            }
        }while(soTien <=0);
        for (int i = 0; i< acs.size(); i ++){
            Account a = acs.get(i);
            if (a.getStk() == stk){
                a.setSoTien(a.getSoTien()-soTien);
                System.out.println("Da rut thanh cong!");
            }else if(a.getStk()!= stk){
                System.out.println("Khong tim thay stk!");
            
            }else {
                System.out.println("Khong du tien rut!!");
            }
        }
    }
    public void chuyenKhoan(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so tai khoan can chuyen: ");
        long stk = sc.nextLong();
        System.out.println("Nhap so tien can chuyen: ");
        double soTien = sc.nextDouble();
        System.out.println("Nhap so tai khoan nhan: ");
        long stk1 = sc.nextLong();
        do{
            if (soTien <=0){
                System.out.println("So tien khong hop le!!");
            }
        }while(soTien <=0);
        for ( int i = 0; i < acs.size() ; i++){
            Account a = acs.get(i);
            if (a.getStk() == stk){
                if (a.getSoTien() >= soTien){
                    a.setSoTien(a.getSoTien() - soTien);
                    System.out.println(" chuyen tien thanh cong");
                }
            }
        }
        for ( int i = 0; i < acs.size() ; i++){
            Account a = acs.get(i);
            if (a.getStk() == stk1){
                a.setSoTien(a.getSoTien() + soTien);
                return;
            }
            else if (a.getStk() != stk1) {
                System.out.println("Khong tim thay STK nay !");
            }
        }
    }

    public void Menu(){
        System.out.println("-----Menu-----\n"+
                "1. Them tai khoan\n"+
                "2. So tk hien co\n"+
                "3. In thong tin\n"+
                "4. Nap tien vao TK\n"+
                "5. Rut tien\n"+
                "6. Chuyen tien\n"+
                "7. Ket thuc\n");
    }
    
    
    
}
