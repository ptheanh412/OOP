/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2lab6;

/**
 *
 * @author 84974
 */
public class HocSinhChuyenToan extends HocSinh {

    public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }
    @Override 
    public double diemTB(){
        return (this.toan *2 + this.ly + this.hoa) /4;
    }
}
