/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;

/**
 *
 * @author 84974
 */
public class CD {
    private int maCD = 999999;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
    public CD(){
        
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if ( this.maCD > 0 && this.maCD < 999999){
            this.maCD = maCD;
        }
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (this.soBaiHat >0){
        this.soBaiHat = soBaiHat;
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if ( this.giaThanh >0){
        this.giaThanh = giaThanh;
        }
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ma CD:");
        maCD = sc.nextInt();
        System.out.println("Nhap tua CD:");
        sc.nextLine();
        tuaCD = sc.nextLine();
        System.out.println("Nhap so bai hat:");
        soBaiHat=sc.nextInt();
        System.out.println("Nhap gia thanh:");
        giaThanh = sc.nextDouble();
        
    }

    @Override
    public String toString() {
        return "CD{" + 
                "maCD=" + maCD + 
                ", tuaCD=" + tuaCD + 
                ", soBaiHat=" + soBaiHat + 
                ", giaThanh=" + giaThanh + '}';
    }
    public double compareTo(CD c){
        return this.giaThanh = (c.giaThanh);
    }
    public String compareTO(CD c){
        return this.tuaCD = (c.tuaCD);
    }
    
    
}
