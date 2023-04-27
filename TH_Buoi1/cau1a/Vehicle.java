/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1a;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private double triGia;
    

    public Vehicle(){
        
    }
    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double thuePhaiNop(){
        if (this.dungTich < 100 ){
            return this.triGia/100;
        }else if(this.dungTich >= 100 && this.dungTich < 200){
            return this.triGia * 3 /100;
        }else{
            return this.triGia * 5/100;
        }
    }
    public void nhap(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap ten chu xe: ");
        tenChuXe = scanner.nextLine();
        System.out.println("Nhap loai xe: ");
        loaiXe = scanner.nextLine();
        System.out.println("Nhap dung tich:");
        dungTich = scanner.nextInt();
        System.out.println("Nhap tri gia xe: ");
        triGia = scanner.nextDouble();
        
    }

}
