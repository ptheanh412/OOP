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
public class PhongLyThuyet extends PhongHoc {
    private boolean mayChieu;

    public PhongLyThuyet(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

    public PhongLyThuyet(boolean mayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;
    }
    
    public PhongLyThuyet(){
        
    }

    public boolean getMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

    @Override
    public String toString() {
        return super.toString()+"mayChieu=" + mayChieu + '}';
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Phong co may chieu khong?");
        this.mayChieu = sc.nextBoolean();
    }
    @Override
    public boolean ktraDatChuan(){
        super.ktraDatChuan();
        if (this.mayChieu){
            return true;
        }else{
           return false;
        }
    }
    
    
}
