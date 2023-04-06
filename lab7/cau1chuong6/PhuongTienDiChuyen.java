/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1chuong6;

/**
 *
 * @author 84974
 */
public abstract class PhuongTienDiChuyen {
   protected String loaiPhuongTien;
   protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
   
   
    
    public String layTenHangSanXuat(){
        return hangSanXuat.tenHangSanXuat;
    }
    public void batDau(){
        
    }
    public void tangToc(){
        
    } 
    public void dungLai(){
        
    }
    abstract double layVanToc();
    
}
