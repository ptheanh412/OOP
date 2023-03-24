
package cau3chuong5;


public class GiaoDichVang extends GiaoDich {
    
    
    private String loaiVang;

    public GiaoDichVang(String loaiVang, String maGD, String ngayGD, double donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    @Override 
    public double thanhTien(){
        return this.getSoLuong() * this.getDonGia();
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{"+ "maGD=" + getMaGD() + ", ngayGD=" + getNgayGD() + ", donGia=" + getDonGia() + ", soLuong=" + getSoLuong() + "loaiVang=" + loaiVang + '}';
    }
    
    
    
}
