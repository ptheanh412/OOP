/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1chuong5;

/**
 *
 * @author 84974
 */
public class ChuyenXeNoiThanh extends Chuyenxe {
    private String soTuyen;
    private double soKmDiDuoc;

 
    public ChuyenXeNoiThanh( String maSoChuyen, String hoTenTaiXe, String soXe,String soTuyen, double soKmDiDuoc, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    
    public ChuyenXeNoiThanh(){
        
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    
    @Override
    
    public double doanhThu(){
        return super.doanhThu();
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" + "soTuyen=" + soTuyen + ", soKmDiDuoc=" + soKmDiDuoc + '}';
    }
    

}
