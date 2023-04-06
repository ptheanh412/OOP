/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1chuong6;

/**
 *
 * @author 84974
 */
public class XeOto extends PhuongTienDiChuyen {
    String loaiNhienLieu;

    public XeOto(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    
    
    @Override
    double layVanToc(){
        return 80;
    }
}
