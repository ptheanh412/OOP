/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1lab6;

/**
 *
 * @author 84974
 */
public class NhanVien {
    public String ten;
    public long luong;

    public NhanVien(String ten) {
        this.ten = ten;
    }
    public NhanVien(){
        
    }
    public String loaiNhanVien(){
       return "";
    }
    public void tinhLuong(){
        
    }
    public void xuatThongTin(){
        System.out.println("Ten nhan vien: " + ten);
        System.out.println("Loai nhan vien:"+ loaiNhanVien());
    }
    
    
   
}
