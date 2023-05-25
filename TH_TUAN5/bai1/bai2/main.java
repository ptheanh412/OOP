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
        KhachHang kh;
        q.laydulieu();
        Scanner sc = new Scanner(System.in);
        int luachon =0;
        do {
            q.menu();
            System.out.print("Nhap lua chon: ");
            luachon = sc.nextInt();
            sc.nextLine();
            if (luachon == 1) {
                kh = new KhachHang();
                q.them(kh);
            } else if (luachon == 2) {
                System.out.println("Nhap CMND khach hang: ");
                String cmnd = sc.nextLine();
                q.banVe(cmnd);
            } else if (luachon == 3) {
                q.hienThiDSKhachHang();
            } else if (luachon == 4) {
                System.out.println("Nhap CMND khach hang: ");
                String cmnd = sc.nextLine();
                q.huyKhachHang(cmnd);
            } else if (luachon == 5) {
                q.thongKe();
            } else if (luachon == 6) {
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine();
                q.luuDSVaoFile(tenFile);
            } else if (luachon == 7) {
                q.hienThiGaChoMuaVe();
            }
        }while (luachon != 0);
    }
}
