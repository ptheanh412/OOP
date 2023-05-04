/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList;

/**
 *
 * @author 84974
 */
public class Main {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien("123", "Nguyen Van A");
        SinhVien sv2 = new SinhVien("543", "Le THi B");
        SinhVien sv3 = new SinhVien("321", "Luong Van C");
        LopHocPhan lhp = new LopHocPhan(new ArrayList<SinhVien>(), "123456", "LT Huong Doi Tuong", "Nguyen Van A", "Thu 7, tiet 4-6, phong A1.1");
        lhp.svs.add(sv1);
        lhp.svs.add(sv2);
        lhp.svs.add(sv3);
        System.out.println(lhp.toString());
        lhp.ds();
        System.out.println("Tong so sinh vien: " + lhp.getSoLuongSV());


    }
}
