/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2chuong5;

import java.util.ArrayList;
public class DanhSachHinh {
    ArrayList<Hinh> dsh; 
    
    public DanhSachHinh(){
        this.dsh = new ArrayList<Hinh>();
    }

    public DanhSachHinh(ArrayList<Hinh> dsh) {
        this.dsh = dsh;
    }
    
    
    public void them(Hinh h){
        dsh.add(h);
    }
    public void inDanhSach(){
        for (Hinh hinh: dsh){
            System.out.println(hinh +"\n");
        }
    }
    
    
    
    
}
