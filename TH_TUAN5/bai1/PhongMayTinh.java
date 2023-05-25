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
public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public PhongMayTinh(int soMayTinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }
    
    
    public PhongMayTinh(){
        
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String toString() {
        return super.toString()+"soMayTinh=" + soMayTinh + '}';
    }
    
    @Override 
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so may tinh: ");
        this.soMayTinh = sc.nextInt();
    }
    
    @Override
    public boolean ktraDatChuan(){
        super.ktraDatChuan();
        if (getDienTich()/soMayTinh == 1.5){
            return true;
        }else{
            return false;
        }
    }
}
