/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c1lab6;

/**
 *
 * @author 84974
 */
public class C1lab6 {

 
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("The Anh");
       
        
        nv = new NhanVienFullTime(1, 3, "Dat");
        nv.xuatThongTin();
        
        
        nv = new NhanVienPartTime(15, "Truong");
        nv.xuatThongTin();
    }
    
}
