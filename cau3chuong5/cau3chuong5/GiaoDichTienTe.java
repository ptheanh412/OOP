
package cau3chuong5;

public class GiaoDichTienTe extends GiaoDich {
   private double tiGia;
    private String loaiTien;

    public GiaoDichTienTe(double tiGia, String loaiTien, String maGD, String ngayGD, double donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }
    
    @Override
    public double thanhTien(){
        if (loaiTien == "USD" || loaiTien == "EURO"){
            return this.getSoLuong() * this.getDonGia() * this.tiGia;
        } if (loaiTien == "VND"){
            return this.getSoLuong() * this.getDonGia();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" + "maGD=" + getMaGD() + ", ngayGD=" + getNgayGD() + ", donGia=" + getDonGia() + ", soLuong=" + getSoLuong() + ", tiGia=" + tiGia + ", loaiTien=" + loaiTien + '}';
    }
    
    
}
