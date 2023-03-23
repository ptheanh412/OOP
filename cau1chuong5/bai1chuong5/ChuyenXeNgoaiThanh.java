/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1chuong5;

/**
 *
 * @author 84974
 */
public class ChuyenXeNgoaiThanh extends Chuyenxe{
    private String noiDen;
    private double soNgayDiDuoc;

    public ChuyenXeNgoaiThanh( String maSoChuyen, String hoTenTaiXe, String soXe, String noiDen, double soNgayDiDuoc, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public ChuyenXeNgoaiThanh(String noiDen, double soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }


    public ChuyenXeNgoaiThanh(){
        
    }
    

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(double soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    @Override
    
    public double doanhThu(){
        return super.doanhThu();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" + "noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + '}';
    }
    

  
    
    
    
}
