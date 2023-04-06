/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau1chuong6;

/**
 *
 * @author 84974
 */
public class Cau1chuong6 {

    
    public static void main(String[] args) {
        XeOto x = new XeOto("xang","4 banh", new HangSanXuat("Merc","Duc"));
        System.out.println(x.loaiPhuongTien + " " + x.layTenHangSanXuat());
    }
    
}
