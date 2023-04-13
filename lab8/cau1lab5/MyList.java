package cau1lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class MyList {
    ArrayList<Double> list; 

    public MyList() {
        list = new ArrayList<>();
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap mot so: ");
            double x = sc.nextDouble();
            list.add(x);

            System.out.println("Nhap them (Y/N)? ");
            sc.nextLine(); // đọc ký tự xuống dòng còn lại
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }
    
    public void xuat(){
        for (double i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.nhap();
        myList.xuat();
    }
}
