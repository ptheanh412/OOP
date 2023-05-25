
package bai2;

import java.util.Scanner;

public class KhachHang {
    private String soCMND;
    private String tenKH, gaDen;
    private double giaTien;
    
    
    public KhachHang(){
        
    }

    public KhachHang(String soCMND, String tenKH, String gaDen, double giaTien) {
        this.soCMND = soCMND;
        this.tenKH = tenKH;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGaDen() {
        return gaDen;
    }

    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so CMND: ");
        this.soCMND = sc.nextLine();
        System.out.println("Nhap ten: ");
        sc.nextLine();
        this.tenKH = sc.nextLine();
        System.out.println("Nhap ga den: ");
        this.gaDen = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        this.giaTien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "KhachHang{" + "soCMND=" + soCMND + ", tenKH=" + tenKH + ", gaDen=" + gaDen + ", giaTien=" + giaTien + '}';
    }
    
}
