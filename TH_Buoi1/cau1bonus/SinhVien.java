/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1bonus;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String hoTen, diaChi, SDT;

    public SinhVien(int mssv, String hoTen, String diaChi, String SDT) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }
    public SinhVien(){
        
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "SinhVien{" + 
                "mssv=" + mssv + 
                ", hoTen=" + hoTen + 
                ", diaChi=" + diaChi + 
                ", SDT=" + SDT + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap mssv: ");
        mssv = sc.nextInt();
        System.out.println("Nhap ho ten: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.printf("Nhap SDT gom 9 chu so: ");
        SDT = sc.nextLine();
        
    }
    public int compareTo(SinhVien s){
        return this.mssv = (s.mssv);
    }
    
    
}
