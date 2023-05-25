/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author 84974
 */
public class PhongHoc {
    private String maPhong, dayNha;
    private double dienTich;
    private int soBongDen;
    
    
    public PhongHoc(){
        
    }

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + ", ";
    }
    
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ma phong: ");
        this.maPhong = sc.nextLine();
        System.out.println("Nhap day nha: ");
        this.dayNha = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        this.dienTich = sc.nextDouble();
        System.out.println("Nhap so bong den: ");
        this.soBongDen = sc.nextInt();
        
    }
    
    public boolean ktraDatChuan(){
        if(dienTich/soBongDen == 10){
            return true;
        }else{
            return false;
        }
    }
    public double compareTo(PhongHoc p){
        return this.dienTich = (p.dienTich);
    }
    public int compareTO(PhongHoc p){
        return this.soBongDen = (p.soBongDen);
    }
    public String compare(PhongHoc p){
        return this.dayNha = (p.dayNha);
    }
    
}
