/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau3chuong5;

/**
 *
 * @author 84974
 */
public class GiaoDich {
    private String maGD, ngayGD;
    private double donGia;
    private int soLuong;

    public GiaoDich(String maGD, String ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double thanhTien(){
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }
    
    
}
