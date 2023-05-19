
package bai2;

import java.util.Scanner; 

public class HangDienMay extends HangHoa {
    private int baoHanh;
    private double congSuat;

    public HangDienMay(int baoHanh, double congSuat) {
        this.baoHanh = baoHanh;
        this.congSuat = congSuat;
    }
    public HangDienMay(){
        
    }

    public HangDienMay(int baoHanh, double congSuat, String maHang, String tenHang, int soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.baoHanh = baoHanh;
        this.congSuat = congSuat;
    }

    public int getBaoHanh(){
        if (this.baoHanh < 0){
            return 0;
        }
        return baoHanh;
    }

    public void setBaoHanh(int baoHanh) {
        this.baoHanh = baoHanh;
    }

    public double getCongSuat() {
        if (this.congSuat < 0){
            return 0;
        }
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public void tienVAT(){
        double vat = donGia + (donGia * 0.1);
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap thoi gian bao hanh: ");
        do{
            baoHanh = sc.nextInt();
            if (baoHanh < 0){
                System.out.println("Nhap lai!!!");
            }
        }while(baoHanh < 0);
        System.out.println("Nhap cong suat: ");
        do{
            congSuat = sc.nextDouble();
            if ( congSuat < 0){
                System.out.println("Nhap lai!!!");
            }
        }while(congSuat < 0);
    }
   
    
    @Override
    public void danhGia(){
        if (getSoLuongTon()<3){
        System.out.println("Hang ban duoc");
    }
}
}
