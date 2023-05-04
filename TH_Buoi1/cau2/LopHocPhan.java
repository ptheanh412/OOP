/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHocPhan {
    ArrayList<SinhVien> svs;
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;

    public LopHocPhan(ArrayList<SinhVien> svs, String maLHP, String tenLHP, String tenGV, String thongTinLopHoc) {
        this.svs = svs;
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public ArrayList<SinhVien> getSvs() {
        return svs;
    }

    public void setSvs(ArrayList<SinhVien> svs) {
        this.svs = svs;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    @Override
    public String toString() {
        return "ma LHP: " + maLHP + '\n' +
               "ten LHP: " + tenLHP + '\n' +
               "ten GV: " + tenGV + '\n' +
               "thong tin lop hoc: " + thongTinLopHoc + '\n';
    }
    public int getSoLuongSV(){
       return svs.size();
    }
    public void ds (){
        System.out.println("Danh sach sinh vien");
        for (SinhVien sv: svs ){
            System.out.format("%-5s %-30s\n",
                    sv.getMaSV(),
                    sv.getHoTen());
        }
}
    
}
