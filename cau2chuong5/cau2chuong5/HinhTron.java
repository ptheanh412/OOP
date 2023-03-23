/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2chuong5;

/**
 *
 * @author 84974
 */
public class HinhTron extends Hinh{
    private float r;

    public HinhTron(float r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }
    @Override
    public double dienTich(){
        return 4*3.14*this.r*this.r;
    }
    
    
}
