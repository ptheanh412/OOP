
package cau2lab6;


public class Cau2lab6 {

    
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("Pham The Anh", "CNTT2",9,8,7 );
        System.out.println("Diem trung binh: " + hs.diemTB());
        
        hs = new HocSinhChuyenToan("Nguyen Quoc Dat", "12", 5, 7.5, 8.5);
        System.out.println("Diem trung binh: "+ hs.diemTB());
                           
    }
    
}
