/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1lab6;

/**
 *
 * @author 84974
 */
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(int gioLamViec, String ten) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }
    
    @Override 
    public String loaiNhanVien(){
        return "Nhan vien Parttime";
    }
    @Override
    public void tinhLuong(){
        
    }
}
