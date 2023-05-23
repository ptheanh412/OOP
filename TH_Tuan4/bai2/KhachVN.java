/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.time.LocalDate;
import java.util.Scanner;



public class KhachVN extends HoaDon{
    private String doiTuong;
    private double dinhMuc;
    
    public KhachVN(String maKH, String hoTen, double soLuong, double donGia, LocalDate ngayRaHD){
        super();
        this.doiTuong =doiTuong;
        this.dinhMuc = dinhMuc;
    }
    
    public KhachVN(){
        
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDoi tuong: " + doiTuong + 
                                  "\nDinh muc: " + dinhMuc;
    }
    
    @Override
    public double thanhTien(){
        if (getSoLuong() <= this.dinhMuc){
            return getSoLuong() * getDonGia();
        }else{
            return (getSoLuong() * getDonGia() * this.dinhMuc) + (getSoLuong() * getDonGia() *2.5);
        }
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap doi tuong (sinh hoat/kinh doanh/san xuat): ");
        this.doiTuong = sc.nextLine();
        System.out.println("Nhap dinh muc: ");
        this.dinhMuc = sc.nextDouble();
        
    }
    
    
}
