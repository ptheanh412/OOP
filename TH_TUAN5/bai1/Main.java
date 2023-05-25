
package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pham The Anh - 1050080043");
        QuanLy q = new QuanLy();
        PhongHoc p = new PhongHoc();

        Scanner sc = new Scanner (System.in);
        int luachon = 0;
        do{
            q.menu();
            System.out.println("\nNhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                System.out.println("----------------------------------------------\n");
                System.out.println("1. Them phong hoc ly thuyet\n"+
                        "2. Them phong hoc may tinh\n"+
                        "3. Them phong hoc thi nghiem\n"+
                        "Nhap lua chon: ");
                System.out.println("----------------------------------------------\n");

                int i = sc.nextInt();
                if (i ==1){
                    p = new PhongLyThuyet();
                    q.them((p));
                }else if ( i==2){
                    p = new PhongMayTinh();
                    q.them(p);
                }else if (i == 3){
                    p = new PhongThiNghiem();
                    q.them(p);
            }}else if (luachon == 2){
                System.out.println("Nhap ma phong: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println(q.timKiemTheoMaPhong(name).toString());
                
            }else if (luachon ==3 ){
                q.xuat();
            }else if(luachon ==4){
                q.xuatPhongDatChuan();
            }else if (luachon ==5)
            {
               System.out.println("----------------------------------------------\n");
               System.out.println("1. Sap xep day nha\n"+
                        "2. Sap xep dien tich\n"+
                        "3. Sap xep bong den\n"+
                        "Nhap lua chon: ");
               System.out.println("----------------------------------------------\n");

                int t = sc.nextInt();
                if (t ==1){
                    q.sapXepDayNha();
                }else if ( t==2){
                    q.sapXepDienTich();
                }else if (t == 3){
                    q.sapXepBongDen();
            }}else if(luachon == 6){
                    System.out.println("Nhap ma phong them may tinh:");
                    sc.nextLine();
                    String mp = sc.nextLine();
                    System.out.println("Nhap so luong may can them: ");
                    int s = sc.nextInt();
                    q.capNhatMay(mp,s);
            }else if( luachon ==7){
                System.out.println("Nhap ma phong can xoa:");
                sc.nextLine();
                String name = sc.nextLine();
                q.xoaPhongHoc(name);
            }else if (luachon ==8){
                System.out.println("Tong so phong hoc la: " +q.tongSoPhong());
            }else if(luachon ==9){
                q.xuatPhongMay();
            }
            
            
        }while (luachon != 0);
    }
    
}

