/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java02 {

    /**
     * @param args the command line arguments
     */
    public static int n;

    public static void main(String[] args) {
        // TODO code application logic here
        do {
            System.out.println("Nhap vao so nhan vien toi da (lon hon 0) : ");
            n = new Scanner(System.in).nextInt();
        } while (n <= 0);
//        NhanVien nv1 = NhanVien.taoNhanVien();
//        NhanVien[] listnv = new NhanVien[n];
//        for (int i = 0; i < n; i++) {
//            listnv[i] = NhanVien.taoNhanVien();
//            listnv[i].nhapNhanVien();
//        }
//
//        for (int i = 0; i < n; i++) {
//            listnv[i].hienThiNhanVien();
//        }
    }

}
