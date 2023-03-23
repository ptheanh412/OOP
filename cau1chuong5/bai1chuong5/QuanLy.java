/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1chuong5;

import java.util.ArrayList;
public class QuanLy {
    ArrayList<Chuyenxe> cs;
     
    
    public QuanLy(){
        this.cs = new ArrayList<Chuyenxe>();
    }

    public QuanLy(ArrayList<Chuyenxe> cs) {
        this.cs = cs;
    }
    public void them(Chuyenxe c){
        cs.add(c);
    }
    public void danhSachCX(){
        for (Chuyenxe c: cs){
            System.out.printf(c+"\n");
        }
    }
}
