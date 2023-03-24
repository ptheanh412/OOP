/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau3chuong5;

/**
 *
 * @author 84974
 */
public class Cau3chuong5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GiaoDich gd1 = new GiaoDichVang("9999", "111", "23/03/2023", 2140000000, 10);
        GiaoDich gd2 = new GiaoDichVang("SjC", "1103", "01/02/2022", 10, 2);
        GiaoDich gd3 = new GiaoDichVang("PNJ","1203","04/12/2022", 1500000000, 3);
        GiaoDich gd4 = new GiaoDichTienTe(3.5, "USD", "3107", "21/12/2021", 500000, 7);
        GiaoDich gd5 = new GiaoDichTienTe(2.3, "VND", "2308", "01/04/2022", 5.9, 8);
        GiaoDich gd6 = new GiaoDichTienTe(6.1, "EURO", "3257", "19/07/2023", 2000000000, 5);
        DSGiaoDich d = new DSGiaoDich();
        d.them(gd1);
        d.them(gd2);
        d.them(gd3);
        d.them(gd4);
        d.them(gd5);
        d.them(gd6);
        d.danhSachGD();
        System.out.print("Tong so luong:");
        System.out.println(gd1.getSoLuong()+gd2.getSoLuong()+gd3.getSoLuong()+gd4.getSoLuong()+gd5.getSoLuong()+gd6.getSoLuong());
      
        double t;
        t = (gd4.thanhTien() + gd5.thanhTien() + gd6.thanhTien()) / 3;
        System.out.println("Trung binh thanh tien GD tien te = " + t);
        
        
    }
    
}
