/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2lab6;

/**
 *
 * @author 84974
 */
public class HocSinh {
    public String hoTen;
    public String lop;
    public double toan;
    public double ly;
    public double hoa;

    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double diemTB(){
        return (this.toan + this.ly + this.hoa) /3; 
    }

}
