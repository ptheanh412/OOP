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
public class PhongThiNghiem extends PhongHoc {
    private String thongTinChuyenNganh;
    private int sucChua;
    private boolean bonRua;

    public PhongThiNghiem(String thongTinChuyenNganh, int sucChua, boolean bonRua) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public PhongThiNghiem(String thongTinChuyenNganh, int sucChua, boolean bonRua, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }
    
    public PhongThiNghiem(){
        
    }

    public String getThongTinChuyenNganh() {
        return thongTinChuyenNganh;
    }

    public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isBonRua() {
        return bonRua;
    }

    public void setBonRua(boolean bonRua) {
        this.bonRua = bonRua;
    }

    @Override
    public String toString() {
        return super.toString()+"thongTinChuyenNganh=" + thongTinChuyenNganh + ", sucChua=" + sucChua + ", bonRua=" + bonRua + '}';
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin chuyen nganh: ");
        this.thongTinChuyenNganh = sc.nextLine();
        System.out.println("Nhap suc chua: ");
        this.sucChua = sc.nextByte();
        System.out.println("Phong co bon rua khong?");
        this.bonRua = sc.nextBoolean();
    }
    
    @Override
    public boolean ktraDatChuan(){
        super.ktraDatChuan();
        if(this.bonRua){
            return true;
        }else{
            return false;
        }
    }
}
