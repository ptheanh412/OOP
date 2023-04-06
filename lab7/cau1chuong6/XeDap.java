/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1chuong6;

/**
 *
 * @author 84974
 */
public class XeDap extends PhuongTienDiChuyen {

    public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }
   
    @Override
    double layVanToc(){
        return 15;
    }
}
