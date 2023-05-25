/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class QuanLy {
    ArrayList<KhachHang> list;
    ArrayList<KhachHang> listMuaVe;
    
    public QuanLy(){
          list = new ArrayList<>();
    }
    
    public void them(KhachHang kh){
          Scanner sc = new Scanner (System.in);
          System.out.println("Nhap so luong can them: ");
          int n = sc.nextInt();
          for(int i = 0; i<n; i ++){
              System.out.println("Lan nhap thu " +i+": ");
                  kh = new KhachHang();
                  kh.nhap();
                  list.add(kh);
          }
      }
    
    public void banVe(String soCMND){
        for (KhachHang kh: list){
            if(kh.getSoCMND().equals(soCMND)){
                System.out.println("Ban ve thanh cong khach hang" +kh.getTenKH());
                list.remove(kh);
                listMuaVe.add(kh);
                return;
            }
        }
        System.out.println("Khong tim thay KH co CMND" + soCMND);
    }
    
    public void hienThiDSKhachHang(){
        if(list.isEmpty()){
            System.out.println("DS khach hang trong!");
            return;
        }
        System.out.println("DS khach hang: ");
        for (KhachHang kh: list){
            System.out.println(kh.toString());
        }
    }
    
    public void huyKhachHang(String soCMND){
        for (KhachHang kh: list){
            if(kh.getSoCMND().equals(soCMND)){
                list.remove(kh);
                System.out.println("Huy thanh cong khach hang"+kh.getTenKH());
                return;
            }
        }
        System.out.println("Khong tim thay CMND" + soCMND);
    }
    
    public void thongKe(){
        double tong = 0;
        System.out.println("So khach hang cho nhan ve: " + list.size());
        System.out.println("So khach hang nhan duoc ve: " + listMuaVe.size());
        for (KhachHang kh: list){
            tong += kh.getGiaTien();
        }
        System.out.println("Tong tien thu ve: " + tong);
    }
    
    public void luuDSVaoFile(String tenFile){
        try {
            FileOutputStream fos = new FileOutputStream(tenFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            System.out.println("Luu thanh cong");
        } catch (IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
    public void hienThiGaChoMuaVe(){
        Set<String> cacGaChoMuaVe = new HashSet<>();
        for (KhachHang kh : list) {
            cacGaChoMuaVe.add(kh.getGaDen());
        }

        if (cacGaChoMuaVe.isEmpty()) {
            System.out.println("Khong co ga nao dang cho mua ve");
        } else {
            System.out.println("Cac ga dang cho ve:");
            for (String ga : cacGaChoMuaVe) {
                System.out.println(ga);
            }
        }
    }
    public void laydulieu() {
        try (BufferedReader br = new BufferedReader(new FileReader("danhsach.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String cmnd = parts[0];
                    String ten = parts[1];
                    String gaDen = parts[2];
                    double giaTien = Double.parseDouble(parts[4]);
                    KhachHang khachHang = new KhachHang(cmnd, ten, gaDen, giaTien);
                    list.add(khachHang);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void menu(){
        System.out.println("------Menu-------\n" +
                    "1.Them khach hang vao hang doi mua ve\n" +
                    "2.Ban ve cho khach hang\n" +
                    "3.Hien thi danh sach\n" +
                    "4.Huy 1 khach hang ra khoi danh sach\n" +
                    "5.Thong ke\n" +
                    "6.Luu danh sach vao file\n" +
                    "7.Hien thi cac ga dang cho mua ve\n");
    }
}
