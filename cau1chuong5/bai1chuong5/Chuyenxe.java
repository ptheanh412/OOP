/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1chuong5;

/**
 *
 * @author 84974
 */
public class Chuyenxe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;

    public Chuyenxe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public Chuyenxe(){
        
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
    
    public double doanhThu(){
            return doanhThu;
    }

    @Override
    public String toString() {
        return "Chuyenxe{" + "maSoChuyen=" + maSoChuyen + ", hoTenTaiXe=" + hoTenTaiXe + ", soXe=" + soXe + ", doanhThu=" + doanhThu + '}';
    }
    

  
    
    
    
}
