/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1a;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<Vehicle> list;
    
    public QuanLy(){
        list = new ArrayList<>();
    }
    public void them (Vehicle xe){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            xe = new Vehicle();
            xe.nhap();
            list.add(xe);
        }
        
        
    }

    public void xuatDs(){
        System.out.format("%-30s %-30s %-30s %-30s %-30s\n",
                           "Ten chu xe",
                           "Loai xe",
                           "Dung tich",
                           "Tri gia",
                           "Thue phai nop");
        System.out.println("========================================================================================================================================");
        for (Vehicle xe: list ){
            System.out.format("%-30s %-30s %-30s %-30.2f %-30.2f\n",
                                 xe.getTenChuXe(),
                                 xe.getLoaiXe(),
                                 xe.getDungTich(),
                                 xe.getTriGia(),
                                  xe.thuePhaiNop());
            //System.out.println(xe+"\n");
        }
    }
    public void Menu(){
        System.out.println("-----Menu-----\n"+
                "1. Nhap thong tin\n"+
                "2. Xuat bang ke khai\n"+
                "3. Thoat");
    }


}
