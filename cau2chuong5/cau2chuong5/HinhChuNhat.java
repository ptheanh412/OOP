/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2chuong5;

/**
 *
 * @author 84974
 */
public class HinhChuNhat extends Hinh {
    private float cd;
    private float cr;

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }
    @Override
    public double dienTich(){
        return this.cd * this.cr;
    }
    
    
}
