/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1lab6;

/**
 *
 * @author 84974
 */
public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem, String ten) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien Fulltime";
    }
    @Override
    public void tinhLuong(){
        
    }

    
    
    
}
