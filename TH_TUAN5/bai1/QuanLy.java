/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class QuanLy {
      ArrayList<PhongHoc> list;
      
      public QuanLy(){
          list = new ArrayList<>();
      }
      
      public void them(PhongHoc p){
          Scanner sc = new Scanner (System.in);
          System.out.println("Nhap so luong can them: ");
          int n = sc.nextInt();
          for(int i = 0; i<n; i ++){
              System.out.println("Lan nhap thu " +i+": ");
              if ( p instanceof PhongLyThuyet){
                  p = new PhongLyThuyet();
                  p.nhap();
              }else if ( p instanceof PhongMayTinh){
                  p = new PhongMayTinh();
                  p.nhap();
              }else if (p instanceof PhongThiNghiem){
                  p = new PhongThiNghiem();
                  p.nhap();
              }
              boolean trungMa = false;
              for(PhongHoc ph: list){
                  if(ph.getMaPhong().equals(p.getMaPhong())){
                      trungMa = true;
                      break;
                  }
              }
              
              if (trungMa){
                  System.out.println("Phong hoc ton tai");
              }else{
                  list.add(p);
                  System.out.println("Da them thanh cong");
              }
          }
 
      }
      
      public PhongHoc timKiemTheoMaPhong(String maPhong){
          for (PhongHoc p: list){
              if(p.getMaPhong().contains(maPhong)){
                  return p;
              }
          }
           return null;
      }
      
      public void xuat(){
          for (PhongHoc p: list){
              System.out.println(p.toString());
          }
      }
      public void xuatPhongDatChuan(){
          for (PhongHoc p: list){
              if(p.ktraDatChuan() == true){
                  System.out.println(p.toString());
              }
          }
      }
    public void sapXepDayNha(){
        Collections.sort(this.list, new Comparator<PhongHoc>(){
                @Override
                public int compare(PhongHoc o1, PhongHoc o2){
                    int i= o1.getDayNha().compareTo(o2.getDayNha());
                    if (i <0){
                        return -1;
                    }else if (i == 0){
                        return 0;
                    }
                    return 1;
                }
        }
        );
        for(PhongHoc p: list){
        System.out.println(p.toString());}
        
    }
    public void sapXepDienTich(){
        Collections.sort(this.list, new Comparator<PhongHoc>(){
        @Override
        public int compare(PhongHoc o1, PhongHoc o2){
                    int i= (int) (o1.getDienTich()- o2.getDienTich());
                    if (i <0){
                        return 1;
                    }else if (i == 0){
                        return 0;
                    }
                    return -1;
                }
        }
        );
        for(PhongHoc p: list){
        System.out.println(p.toString());}
    }
    public void sapXepBongDen(){
        Collections.sort(this.list, new Comparator<PhongHoc>(){
        @Override
        public int compare(PhongHoc o1, PhongHoc o2){
                    int i= (int) (o1.getSoBongDen()- o2.getSoBongDen());
                    if (i <0){
                        return -1;
                    }else if (i == 0){
                        return 0;
                    }
                    return 1;
                }
        }
        );
        for(PhongHoc p: list){
        System.out.println(p.toString());}
    }
    public void capNhatMay(String maPhong, int soMayCapNhat){
        PhongHoc p = timKiemTheoMaPhong(maPhong);
        if( p!= null && p instanceof PhongMayTinh){
            PhongMayTinh pmt = (PhongMayTinh) p;
            pmt.setSoMayTinh(pmt.getSoMayTinh() + soMayCapNhat);
            System.out.println("Cap nhat thanh cong!");
        }else{
            System.out.println("Phong hoc khong phai phong may tinh");
        }
    }
    public void xoaPhongHoc(String name) {
        Iterator<PhongHoc> iterator = list.iterator();
        while (iterator.hasNext()) {
            PhongHoc p = iterator.next();
            if (p.getMaPhong().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Da xoa thanh cong " + name);
                return;
            }
        }
    }
    public int tongSoPhong(){
        return list.size();
    }
    
    public void xuatPhongMay(){
        System.out.println("Cac phong co 60 may:");
        for (PhongHoc p: list){
            if (p instanceof PhongMayTinh && ((PhongMayTinh) p).getSoMayTinh() == 60){
                System.out.println(p.toString());
        }
        }
    }
    public void menu(){
          System.out.println("----------------------Menu-------------------\n");
          System.out.println("1. Them phong hoc\n"
          + "2. Tim kiem\n"
          + "3. In danh sach\n"
          + "4. In phong dat chuan\n"
          + "5. Sap xep\n"
          + "6. Cap nhat so may tinh\n"
          + "7. Xoa 1 phong hoc\n"
          + "8. Tong so phong hoc\n"
          + "9. In phong co 60 may\n");
          System.out.println("----------------------------------------------\n");

    }
}
