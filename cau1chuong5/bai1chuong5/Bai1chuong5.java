
package bai1chuong5;


public class Bai1chuong5 {

  
    public static void main(String[] args) {
        
        ChuyenXeNoiThanh cx1 = new ChuyenXeNoiThanh( "02", "anh", "59G-11 156.74","3", 50.5, 1500);
        System.out.println("Doanh thu chuyen noi thanh:" + cx1.doanhThu());
        Chuyenxe cx2 = new ChuyenXeNgoaiThanh(  "11","pham", "59Y-11 145.78", "Tp.HCM", 3.5, 2500);
        System.out.println("Doanh thu chuyen ngoai thanh:" + cx2.doanhThu());
        System.out.print("Tong doanh thu:");
        System.out.println(cx1.doanhThu() + cx2.doanhThu() );
        
        QuanLy q =new QuanLy();
        q.them(cx1);
        q.them(cx2);
        q.danhSachCX();
        
        
  
    }
    
}
