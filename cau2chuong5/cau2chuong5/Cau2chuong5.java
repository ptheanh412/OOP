/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau2chuong5;


public class Cau2chuong5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hinh hcn = new HinhChuNhat(5, 4);
        System.out.println("dien tich hcn: "+ hcn.dienTich());
        Hinh ht = new HinhTron(3);
        System.out.println("dien tich htron: "+ht.dienTich());
        
        DanhSachHinh ds = new DanhSachHinh();
        ds.them(hcn);
        ds.them(ht);
        ds.inDanhSach();
    }
    
}
