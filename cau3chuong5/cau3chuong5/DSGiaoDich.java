/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau3chuong5;

import java.util.ArrayList;

public class DSGiaoDich {
    ArrayList<GiaoDich> gd;

    public DSGiaoDich() {
        this.gd = new ArrayList<GiaoDich>();
    }
    public DSGiaoDich(ArrayList<GiaoDich> gd){
        this.gd = gd;
    }
    
    public void them(GiaoDich a){
        gd.add(a);
    }
    public void danhSachGD(){
        for (GiaoDich a: gd){
            if (a.getDonGia()>1000000000){
            System.out.println(a+"\n");}
        }
    }
    
    
    
    
}
