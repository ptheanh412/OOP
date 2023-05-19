/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        QuanLy q = new QuanLy();
        Scanner sc = new Scanner(System.in);
        HangHoa h;
        int luachon = 0;
        do{
            q.menu();
            System.out.println("Nhap lua chon:");
            luachon = sc.nextInt();
            if (luachon ==1){
                System.out.println("A. In danh sach");
                System.out.printf("1. In tat ca hang hoa"+
                        "2. In hang thuc pham\n"+
                        "3. In hang dien may\n"+
                        "4. In hang sanh su"+
                        "Nhap lua chon: ");
                int i =sc.nextInt();
                if (i ==1){
                    q.xuat();
                }
            }else if (luachon ==2 ){
                System.out.println("B. Them hang hoa");
                System.out.printf("1. Them hang thuc pham\n"+
                        "2. Them hang dien may\n"+
                        "3. Them hang sanh su\n"+
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i ==1){
                    h = new HangThucPham();
                    q.themHH(h);
                }else if ( i==2){
                    h = new HangDienMay();
                    q.themHH(h);
                }else if (i ==3){
                    h = new HangSanhSu();
                    q.themHH(h);
                }
            }
            
        }while (luachon != 0);
    }
}
