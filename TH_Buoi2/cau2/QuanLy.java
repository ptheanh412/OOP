/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLy {
    ArrayList<CD>cds;
    
    public QuanLy(){
        this.cds = new ArrayList<>();
    }
    
    public void them(CD cd){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap sl can them: ");
        int n = 0;
        n = sc.nextInt();
        for ( int i = 0; i<n; i++){
            cd = new CD();
            cd.nhap();
            cds.add(cd);
        }
    }
    public void tinhSL(){
        cds.size();
    }
    public void tinhTongGia(){
        double tong =0;
        for (int i =0; i < cds.size();i++){
            tong += cds.get(i).getGiaThanh();
        }
        System.out.println("Tong gia CD: " + tong);
    }
    public void sapXepGiaThanh(){
        Collections.sort(this.cds, new Comparator<CD>(){
                @Override
                public int compare(CD o1, CD o2){
                    int i= (int) (o1.getGiaThanh() - o2.getGiaThanh());
                    if (i <0){
                        return -1;
                    }else if (i == 0){
                        return 0;
                    }
                    return 1;
                }
        }
        );
        for(CD cd: cds){
        System.out.println(cd.toString());}
    }
    public void sapXepTuaCD(){
        Collections.sort(this.cds, new Comparator<CD>(){
                @Override
                public int compare(CD o1, CD o2){
                    int i= o1.getTuaCD().compareTo(o2.getTuaCD());
                    if (i <0){
                        return 1;
                    }else if (i == 0){
                        return 0;
                    }
                    return -1;
                }
        }
        );
        for(CD cd: cds){
        System.out.println(cd.toString());}
        
    }
    public void xuatDS(){
        for(CD cd: cds){
        System.out.println(cd.toString());}
    }
    public void Menu(){
        System.out.println("-----Menu-----\n"+
                "1. Nhap thong tin \n"+
                "2. So CD hien co\n"+
                "3. In thong tin\n"+
                "4. Tong gia thanh cac CD\n"+
                "5. Sap xep tang dan theo gia\n"+
                "6. Sap xep giam gian theo tua\n"+
                "7. Ket thuc\n");
    }
    
}
